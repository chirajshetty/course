package _03;
/*
 * Topic : Using loop constructs 
 * Code: 03
 * 
 */

public class Question_19 {

	public static void main(String[] args) {
		String[] arr = {"A","B","C","D"};
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
			if(arr[i].equals("C")) {
				continue;
			}
			System.out.print("Done");
			break;
		}

	}

}

/*
 * What is the result of the code ?
 * 
 * a)
 * A B C D Done
 * 
 * b)
 * A B C Done
 *  
 * c)
 * A Done
 *   
 * d)
 * Compilation Error
 ** 
 *   
 * Answer : 
 * c)
 * A Done 	
 * 
 * Explanation:
 * This is tricky question which checks your understanding on the usage of break and continue.
 * When the break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.
 * The continue keyword can be used in any of the loop control structures. It causes the loop to immediately jump to the next iteration of the loop. 
 * 
 * So in this question there is one for loop.
 * The if condition fails for the first iteration itself and skips out 'continue'.
 * It resumes to rest of the statements and reaches 'break' which then breaks the iteration to end the program after the first iteration.
 * So the output is --> A Done.
 * 
 * 
 * Additional Explanation: 
 * https://www.tutorialspoint.com/How-to-use-break-and-continue-statements-in-Java
 * 
 * Source : 
 * Actual Test 30 
 */

