/*
 Array implementation of stacks.
*/
 
public class ArrayStack {
    /* Declare a class constant called DEFAULT_STACK_SIZE with the value 10.
    */
    private static final int DEFAULT_STACK_SIZE = 10;
    /* Declare two instance variables:
       1. an integer called topOfStackIndex
       2. a reference variable of type array of objects.
    */
	private static int topOfStackIndex = 0;
	Object stack[];
    
    /* Complete the one parameter constructor.
       The parameter indicates the size of the stack
       (i.e. the size of the array that represents that stack.)
       Be sure to create the array!
    */
    public ArrayStack(DEFAULT_STACK_SIZE) {
		Object stack[] = DEFAULT_STACK_SIZE;
    }
    
    /* Write the default (no parameter) constructor.
       Initialize the instance variables by invoking the one parameter constructor
       you just completed. Set the size of the stack to DEFAULT_STACK_SIZE.
       
    */
    public ArrayStack() {
        Object stack[] = null;
		topOfStackIndex = 0;
    }
    
    /* Complete the push operation.
       Be sure to first check to see if the stack is full.
       If the stack is full invoke the method expandCapacity to 'grow' the stack.
    */
    public void push(Object element) {
		int i = 0;
        if (stack.isEmpty() == true) {
			firstIn = element.push(stack[0]);
		}
		else {
			++i;
			lastIn = element.push[i];
		}
    }
    
    /* Complete the peek operation.
       It should throw an EmptyCollectionException if the stack is empty.
    */
    public Object peek() throws EmptyCollectionException {
		if (stack.isEmpty() == true)
			throw EmptyCollectionException("Array is emtpy");
		for (int i = 0; i < stack.size(); i++) {
			system.out.println(stack[i]);
		}
       
    }

    /* Complete the pop operation.
       Like the peek operation, pop should throw an EmptyCollectionException if the stack is empty.
       Be sure to set the position from where the element was removed to null.
     */
    public Object pop() throws EmptyCollectionException {
        if (stack.isEmpty() == true)
			throw EmptyCollectionExceptionction("Array is empty");
		stack.pop(lastIn);
    }
   
    /* Write the method isEmpty.
       It returns true if the stack is empty and false otherwise.
     */
    public boolean isEmpty() {
        if (stack[] == null) {
			return true;
		}
		else {
			return false;
		}
    }
 
    /* Write the method size.
       It returns an integer representing the number of items on the stack.
    */
    public int size() {
		count = stack.size();
		return count
    }

    /* This method has been completed for you.
     */
    public String toString() {
        return(this.toString());
    }
    
    /* This method is called from the push method when the stack is full.
       It should keep the current stack contents and double the size of the stack.
       Hint: look at the methods in the Arrays class to help you here.
     */
    private void expandCapacity() {
        stack.copyOf(Object[] stack, (int DEFAULT_STACK_SIZE * 2));
    }

}

