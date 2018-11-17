/* Uses multiple threads to increment a shared counter.
 * If -DMUTEX is specified at compile time, a
 * mutex protects against concurrent modification.
 * Without the mutex, the result is incorrect!
 * Also prints out the CPU time.
 *
 * The number of threads and the number of increments per
 * thread must be given on the command line.
 *
 * Dale Shpak
 * Sept 4, 2017
 */

#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <time.h>

#define MIN_THREADS 2
#define MIN_ITERS 1000

#ifndef NO_MUTEX
pthread_mutex_t testMutex = PTHREAD_MUTEX_INITIALIZER;
#endif
static long total = 0;

/* Code that is run by each thread to repeatedly
 * increment the shared counter
 */
void *countUp(void *np) {
    long n = *((long *) np);

    for (int k = 0; k < n; k++) {
        #ifndef NO_MUTEX 
        pthread_mutex_lock(&testMutex);
        #endif        
        ++total;
        #ifndef NO_MUTEX
        pthread_mutex_unlock(&testMutex);
        #endif
    }
}

int main(int argc, char *argv[]) {
    clock_t start, end;
    int nThreads;
    long nIters;
    if (argc < 3) {
        printf("Not enough arguments supplied");
        return EXIT_FAILURE;
    }
    if (sscanf(argv[1], "%d", &nThreads) != 1) {
        printf("Not a valid number");
        return EXIT_FAILURE;
    }
    if (nThreads < MIN_THREADS) {
        printf("Less than minimum acceptable value");
        return EXIT_FAILURE;
    }
    if (sscanf(argv[2], "%ld", &nIters) != 1) {
        printf("Not a valid number");
        return EXIT_FAILURE;
    }
    if (nIters < MIN_ITERS) {
        printf("Not a valid number");
        return EXIT_FAILURE;
    }

    pthread_t *threadIDs = (pthread_t*) malloc(nThreads * sizeof (pthread_t));

    start = clock();

    for (int k = 0; k < nThreads; k++) {
        // Passing nIters as shown below is unsafe if nIters changes!
        // This is because we are passing a pointer to nIters
        pthread_create(&threadIDs[k], NULL, countUp, (void *) &nIters);
    }

    // The main() thread needs to wait for the other threads to complete.
    // Otherwise main() will complete before our worker threads
    for (int k = 0; k < nThreads; k++) {
        pthread_join(threadIDs[k], NULL);
    }

    end = clock();

    printf("Total is %ld.  It should be %ld.  %lf%% success. CPU time %lf ms\n",
            total, nIters*nThreads, 100.0 * total / (nIters * nThreads), 1000.0 * (end - start) / CLOCKS_PER_SEC);

    free(threadIDs); // Not really needed here since main() is completing...

    return EXIT_SUCCESS;
}

