/*
 * NOT COMPLETED 
 * Topic : 
 * Code: 
 * 
 */

public class Question_27 {

	public static void main(String[] args) {
		String[] arr = new String[2];
		int id = 0;
		for(String str : arr) {
			arr[id].concat(" Word "+ id);
			id++;
		}
		for(id = 0 ; id < arr.length; id++) {
			System.out.println(arr[id]);
		}

	}

}



/*
 * What is the output of the above ?
 * 
 * a)
 * Word 1 
 * Word 2 
 * 
 * b)
 * Null
 * Null
 *   
 * c)
 * Null Word 1 
 * Null Word 2
 *   
 * d)
 * NullPointerException
 *   
 * Answer : 
 * d)
 * NullPointerException
 *  
 * Explanation:
 *  
 * 
 * Additional Explanation: 
 * 
 */
