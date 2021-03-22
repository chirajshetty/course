/*
 * NOT COMPLETED 
 * Topic : 03
 * Code: Using loops 
 * 
 */

public class Question_26 {

	public static void main(String[] args) {
		int[] arr = {5,6,7,8};
		int i=0;
		do {
			System.out.print(arr[i] + " ");
			i++;
		} while(i < arr.length + 1 );
	}
}


/*
 * What is the output of the above ?
 * 
 * a)
 *  5 6 7 8 followed by ArrayindexOutOfBoundsException
 * 
 * b)
 * 	5 6 7
 *   
 * c)
 *  5 6 7 8
 *  
 * d)
 *  Compilation Error
 *   
 * Answer : 
 * a)
 *  5 6 7 8 followed by ArrayindexOutOfBoundsException
 * 
 * 
 * Explanation:
 * The do while loop is an exit controlled loop. 
 * The length of the array is 4 but the while condition is set when i<5.
 * At the last iteration the value of i is 4 and since the index is out of bound
 * so the array throws a Runtime Exception of ArrayindexOutOfBoundsException.
 *   
 * 
 * Additional Explanation: 
 * 
 */



