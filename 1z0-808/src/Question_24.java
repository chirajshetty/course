/*
 * Topic : Using loop constructs
 * Code: 03
 * 
 */

public class Question_24 {

	public static void main(String[] args) {
		
		String[][] arr = {{"P","Q","R"},{"S","T"}};
		
		for(int i=0 ; i< arr.length; i++) {
			for(int j=0 ; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				if(arr[i][j].equals("Q")) {
					break;
				}
			}
			continue;
		}
	}

}


/*
 * What is the output of the above ?
 * 
 * a)
 *  P Q R
 * 
 * b)
 *  P Q R S T 
 *   
 * c)
 *  P R S T 
 *   
 * d)
 *  P Q S T 
 *   
 * Answer : 
 * d)
 *  P Q S T 
 * 
 * 
 * Explanation:
 * This is tricky question which checks your understanding on the usage of break and continue.
 * When the break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.
 * The continue keyword can be used in any of the loop control structures. It causes the loop to immediately jump to the next iteration of the loop. 
 * 
 * So in this question there is two for loop.
 * The 'break' is associated with the second for loop and the 'continue' is associated with the first.
 * 
 * The 2D array has two rows. Variable i denotes the rows and j the columns. 
 * The if condition in the second for loop check whether the element is 'Q' or not.
 * In the first row when j reaches to index of 'Q' it calls the 'break' exiting the second loop and missing the index of 'R'.
 * Therefore the output is --> P Q S T .   
 * 
 * Additional Explanation: 
 * https://www.tutorialspoint.com/How-to-use-break-and-continue-statements-in-Java
 * 
 * Source : 
 * Actual test 48
 */



