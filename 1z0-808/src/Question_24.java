/*
 * NOT COMPLETED 
 * Topic : 
 * Code: 
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
 * 
 * 
 * 
 * Additional Explanation: 
 */



