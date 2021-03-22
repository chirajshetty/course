/*
 * Topic : Using Loop Constructs
 * Code: 03
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
		return (z--) > 0 ? true : false ; //line 3 
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
 * Option c) is the correct answer.
 * 
 * The following code, without any modification, compiles to form a infinite loop.
 * Option A does not improve the situation and produces infinite loop, so it is incorrect .
 * Option B, C and D takes care of the infinite loop problem but  B and D produces output as 543210 instead of the required 654321.
 * Therefore, Option C is the correct answer. 
 * 
 * 
 * Additional Explanation: 
 * The variable z in line 3 is an local variable, though it is a copy of the variable z in the main method but any update on this local variable doesnot effect the original variable z in main method. 
 * 
 * Source : 
 * Actual Test 20
 * 
 */
