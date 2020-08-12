/*
 * NOT COMPLETED 
 * Topic : 
 * Code: 
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
 * 
 * 
 * Additional Explanation: 
 */

