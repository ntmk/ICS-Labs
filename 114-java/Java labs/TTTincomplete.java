/* 
   A friend of yours is learning Java and they need your help.
   They are trying to write a program that plays tic-tac-toe using Java fundamental programming construcst,
   that is without using object oriented programming.
   Your friend's first programming language is Python so, they are struggling with Java syntax.
   Your task is to complete this program.
  
   There are no intential logic errors here. Concentrate on syntax. Add the code exactly as described 
   in the comments and the game will work.
   
   Your friend has included comments where you need to add code.
   Note that your friend has used spaces (not tabs) for indentation. It's best if you do the same.

  
   This class plays the game tic-tac-toe.
   It is designed using fundamental programming techniques; that is,
   without objects.
   Modularity with overloaded methods is demonstrated.
   
*/

/*
I think I have to include something here to be able to use the Scanner class
*/

import java.util.Scanner;

public class TTTincomplete {
	/* Declare 5 constants with the given values:
	
	   COMPUTER - a character constant with the value X
	   PLAYER - a character constant with the value O (the letter Oh)
	   NO_WINNER - a character constant with a space as its value
	   TIE - a character constant with a dash as it's value
	   MAX_POSITION - an integer constant with the value 9
	   ERROR - an integer constant with the value -1
	*/

    final static char COMPUTER = 'X';
    final static char PLAYER = 'O';
    final static char NO_WINNER = ' ';
    final static char TIE = '-';
    final static int MAX_POSITION = 9;
    final static int ERROR = -1;

    
    
	public static void main(String[] args) throws Exception {

		Scanner scnr = new Scanner(System.in);

		/* Declare 9 character variables and initialize each of them to a space.
		   The variable names must be pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9
		*/
		
        char pos1 = ' ';
        char pos2 = ' ';
        char pos3 = ' ';
        char pos4 = ' ';
        char pos5 = ' ';
        char pos6 = ' ';
        char pos7 = ' ';
        char pos8 = ' ';
        char pos9 = ' ';
    
        
        
		int position;
		char whoWon;

        welcome();

		
		
			
        do {
            
            position = makeAMove(pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9);

			switch (position) {
				/* This switch statement needs to be completed.
				   cases 5-9 need to be written. Just follow the pattern that cases 1-4 show.
				   Add a default case which will print that an error has occurred and quit execution.
				*/
				case 1 : pos1 = COMPUTER; break;
				case 2 : pos2 = COMPUTER; break;
				case 3 : pos3 = COMPUTER; break;
				case 4 : pos4 = COMPUTER; break;
				case 5 : pos5 = COMPUTER; break;
				case 6 : pos6 = COMPUTER; break;
				case 7 : pos7 = COMPUTER; break;
				case 8 : pos8 = COMPUTER; break;
                case 9 : pos9 = COMPUTER; break;
			    }
		 
			drawBoard(pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9);

			whoWon = winner(pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9);

			if ((whoWon!=TIE) && (whoWon==NO_WINNER)) {
				position = makeAMove(scnr, pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9);

				/* I need another switch statement here. I've written part of the first line. 4
				   It should Switch on the variable position.
				   If position is 1 then assign PLAYER to pos1,
				   else if position is 2 then assign PLAYER to pos2,
				   etc. for values of position up to 9.
				   Include a default case as you did above which will print that an error has occurred
				   and then quit execution.
				*/
                
				switch (position) {
                    case 1 : pos1 = PLAYER; break;
                    case 2 : pos2 = PLAYER; break;
                    case 3 : pos3 = PLAYER; break;
                    case 4 : pos4 = PLAYER; break;
                    case 5 : pos5 = PLAYER; break;
                    case 6 : pos6 = PLAYER; break;
                    case 7 : pos7 = PLAYER; break;
                    case 8 : pos8 = PLAYER; break;
                    case 9 : pos9 = PLAYER; break;
                    }
            }

			/* Invoke (call) the method drawBoard with actual parameters pos1 through pos 9.
			*/
            
            drawBoard(pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9);
			
            /* The method winner returns a value. Assign that returned value into variable whoWon
			*/

            whoWon = winner(pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9);
                
		} while(whoWon == NO_WINNER);
	

		reportWinner(whoWon);
}



	public static void reportWinner(char whoWon) {

	switch (whoWon) {
		case COMPUTER : System.out.println("I won."); break; 
		case PLAYER : System.out.println("Congratulations. You won."); break;
		case TIE : System.out.println("Tie game"); break;
		default : System.out.println("Tic-Tac-Toe error in reportWinner"); break;
	}

	}

	public static void welcome() {
		System.out.println("Welcome to <your name>'s Tic-Tac-Toe");
		System.out.println("I'm X. You're O.");
		System.out.println("I'll go first.");
		System.out.println("Each position on the board is represented as follows: ");
		System.out.println("	1 | 2 | 3");
		System.out.println("   -----------");
		System.out.println("	4 | 5 | 6");
		System.out.println("   -----------");
		System.out.println("	7 | 8 | 9");
	}

	public static void drawBoard(char pos1, char pos2, char pos3, 
 				   char pos4, char pos5, char pos6, 
				   char pos7, char pos8, char pos9) {
		System.out.println();
		System.out.println("	 " + pos1 + " | " + pos2 + " | " + pos3);
		System.out.println("	 ---------");
		System.out.println("	 " + pos4 + " | " + pos5 + " | " + pos6);
		System.out.println("	 ---------");
		System.out.println("	 " + pos7 + " | " + pos8 + " | " + pos9);
		System.out.println();
	}

	public static boolean wins(char square1, char square2, char square3) {
		
		/* The body of this method should consist of an if-else statement.
			If (square1 is COMPUTER or PLAYER) AND
		      (square1 is square2 AND square2 is square3) the method must return the boolean true
			Otherwise, the method must return false.
		*/

        if (((square1 == COMPUTER || square1 == PLAYER) && (square1 == square2) && square2 == square3)) {
            return true;
        } else {
            return false; 
        }
	}

	public static char winner(char pos1, char pos2, char pos3, 
					char pos4, char pos5, char pos6, 
					char pos7, char pos8, char pos9) {

		/*
			Declare a local variable of type char, called whoWins
		*/
        
        char whoWins = ' ';

		if (wins(pos1, pos2, pos3) || wins(pos1, pos4, pos7) || wins(pos1, pos5, pos9))
			whoWins=pos1;
		else if (wins(pos4, pos5, pos6) || wins(pos2, pos5, pos8) || wins(pos3, pos5, pos7))
			whoWins=pos5;
		else if (wins(pos7, pos8, pos9) || wins(pos3, pos6, pos9))
			whoWins=pos9;
		else if (boardPositionTaken(pos1) && boardPositionTaken(pos2) && boardPositionTaken(pos3) &&
			boardPositionTaken(pos4) && boardPositionTaken(pos5) && boardPositionTaken(pos6) &&
			boardPositionTaken(pos7) && boardPositionTaken(pos8) && boardPositionTaken(pos9))
				whoWins = TIE;
		/* If none of the above is true, whoWins should be assigned the value NO_WINNER
		*/
        
        else whoWins = NO_WINNER; 
        
	/* The method winner should return the value of variable whoWins.
	*/
	
        return whoWins; }

	/* The makeAMove method is missing its formal parameters:
		first parameter is of type Scanner,
		the next 9 parameters are of type char.
		To determine the names of the parameters, look in the body of the method.
	   The method also needs to 'throws Exception' as input is involved in this method and,
	   therefore, there is a potential for an input error which we are going to 'throw' instead of
	   handling it.
	*/

	public static int makeAMove(Scanner scnr, char pos1, char pos2, char pos3, char pos4, char pos5, char pos6, char pos7, char pos8, char pos9) throws Exception {

		/* Declare 3 local variables here:
			available of type boolean (initialized to false),
			position an integer,
			legal of type boolean (initialized to true)
		*/
        
        boolean available = false;
        int position;
        boolean legal = true;
    
        
		do {
			System.out.print("Enter the integer representing the board position where " + 
							"you would like to place an O : ");
			/* Get an integer from the Scanner variable and store it in position.
			*/
            
            position = scnr.nextInt();
            
            
			if ((position <1) || (position > MAX_POSITION)) legal=false;
			else {
				legal=true;
				available = isFree(position, pos1, pos2, pos3,pos4, pos5, pos6, pos7, pos8, pos9);
		}

		if (!legal) {
			System.out.println("That's an illegal board position");
			System.out.println("Legal board positions are 1 through " + MAX_POSITION + 
								  " Try again.");
		}

		/* If legal is true and available is not true, output the given error message.
		*/
            if ((legal == true) && (available != true)) 
            
			System.out.println("That position is taken. Please select another.");

            
            
		} while ((!available) || (!legal));

		return(position);
	
    }
    
	public static boolean isFree(int pos,
				 char pos1, char pos2, char pos3,
				 char pos4, char pos5, char pos6,
				 char pos7, char pos8, char pos9) {
		boolean free = false;

		switch (pos) {
			case 1 : if (!boardPositionTaken(pos1)) free=true; break;
			case 2 : if (!boardPositionTaken(pos2)) free=true; break;
			case 3 : if (!boardPositionTaken(pos3)) free=true; break;
			case 4 : if (!boardPositionTaken(pos4)) free=true; break;
			case 5 : if (!boardPositionTaken(pos5)) free=true; break;
			case 6 : if (!boardPositionTaken(pos6)) free=true; break;
			case 7 : if (!boardPositionTaken(pos7)) free=true; break;
			case 8 : if (!boardPositionTaken(pos8)) free=true; break;
			case 9 : if (!boardPositionTaken(pos9)) free=true; break;
			default : {
				System.out.println("TTT: fatal error - pos is " + pos);
				System.exit(ERROR);
			}
		}
		return(free);	
	}


	public static int makeAMove(char pos1, char pos2, char pos3, 
				  char pos4, char pos5, char pos6, 
				  char pos7, char pos8, char pos9) {

		boolean available=false;
		int position;

		System.out.println();
		System.out.println("ok, here's my X: ");

		do {
			position = (int)(Math.random() * MAX_POSITION) + 1 + 1;

			switch (position) {
				case 1 : if (!boardPositionTaken(pos1)) available=true; break;
				case 2 : if (!boardPositionTaken(pos2)) available=true; break;
				case 3 : if (!boardPositionTaken(pos3)) available=true; break;
				case 4 : if (!boardPositionTaken(pos4)) available=true; break;
				case 5 : if (!boardPositionTaken(pos5)) available=true; break;
				case 6 : if (!boardPositionTaken(pos6)) available=true; break;
				case 7 : if (!boardPositionTaken(pos7)) available=true; break;
				case 8 : if (!boardPositionTaken(pos8)) available=true; break;
				case 9 : if (!boardPositionTaken(pos9)) available=true; break;
				default : {
				}
			}
		} while (!available);

		return(position);
	}

	/* You need to write an entire (short) method here.
		The method name is boardPositionTaken.
		It takes one character formal parameter.
		It returns a boolean.
		If the formal parameter is equal to COMPUTER or PLAYER then the method returns true,
		otherwise the method returns false.
	*/
    
   public static boolean boardPositionTaken(char letter) {
        
        if (letter == COMPUTER || letter == PLAYER) {
            return true;
        } else { return false;
        }
    }
        
	
}