/*
 * Topic : Using Loop Constructs 
 * Code: 03
 * 
 */

public class Question_16 {

	public static void main(String[] args) {
		int n = 5;
		do {
			System.out.print(n-- + " ");
		}while(n == 0);
	}

}


/*
 * What is the result of the code ?
 * 
 * a)
 * 5
 * 
 * b)
 * 3 2 1 
 *  
 * c)
 * 5 4 3 2 1 
 *   
 * d)
 * 5 4 3 2 1 0
 * 
 *   
 * Answer : 
 * a)
 * 5 	
 * 
 * Explanation:
 * This is trick question which assumes to miss the details of the question.
 * The condition n == 0 is false in the first loop itself. So the output is 5. Option A is correct .
 * The do while loop is an exit controlled loop an prints atleast once if the condition is false.
 * 
 * Additional Explanation: 
 * Difference between while and do while loop .
 */

