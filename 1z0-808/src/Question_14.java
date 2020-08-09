/*
 * NOT COMPLETED 
 * Topic : 
 * Code: 
 * 
 */

public class Question_14 {

	public static void main(String[] args) {
		int z = 6;
		while(isGreater(z)) {
			System.out.println(z);      //line 1
										//line 2
		}
	}
	
	public static boolean isGreater(int z) {
		return z-- > 0 ? true : false ; //line 3 
	}

}


/*
 * Choose the modification that will enable the code to print 654321 ?
 * 
 * a)
 * Replace line 3 with (z--) > 0 ? true : false ; 
 * 
 * b)
 * Replace line 1 with System.out.println(--z); 
 *  
 * c)
 * At line 2, insert z--;
 *   
 * d)
 * Replace line 1 with z-- and at line 2, insert System.out.print(z); 
 * 
 * Answer : 
 * c)
 * At line 2, insert z--;
 * 
 * Explanation:
 * 
 * 
 * Additional Explanation: 
 * 
 */
