/*
 * Topic : Using loop constructs 
 * Code: 03
 * 
 */

public class Question_20 {

	public static void main(String[] args) {
		int i = 0;
		int j = 9;
		for(i = 0; i<j-1 ; i=i+2) {
			System.out.print(i + " ");
		}
	}
}


/*
 * What is the result of the code ?
 * 
 * a)
 * 2 4 
 * 
 * b)
 * 0 2 4 
 *  
 * c)
 * Runtime Exception
 *   
 * d)
 * 0 2 4 6 
 *
 *   
 * Answer : 
 * d)
 * 0 2 4 6
 * 
 * Explanation:
 * It is simple question,
 * The for loop can be represented as :
 * for(i = 0; i<8 ; i=i+2)
 * which set i as 0,2,4,6 through its iteration.
 * 
 * 
 * Additional Explanation: 
 * for Loop 
 * 
 * Source : 
 * Actual Test 34 
 */

