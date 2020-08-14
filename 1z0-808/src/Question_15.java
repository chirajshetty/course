/*
 * Topic : Using Operators and Decision Constructors
 * Code: 02
 * 
 */

public class Question_15 {

	public static void main(String[] args) {
//		boolean x = true;				//line 1
//		switch (x) {
//		case true:						//line 2
//			System.out.print("True");
//			break;						//line 3 
//		default:
//			System.out.print("Not True");
//		}
		System.out.print("Done");
	}

}

/*
 * Choose the modification that will enable the code to print TrueDone ?
 * 
 * a)
 * Replace line 1 with String x = "true";	
 * Replace line 2 with case "true":	 
 * 
 * b)
 * Replace line 1 with boolean x = 1;		
 * Replace line 2 with case 1:	 
 *  
 * c)
 * At line 3, remove the break statement.	 
 *   
 * d)
 * Remove the default Section
 * Replace line 1 with String x = "true";	
 * Replace line 2 with case "true":	 
 * 
 * Answer : 
 * a)
 * Replace line 1 with String x = "true";	
 * Replace line 2 with case "true":	
 * 
 * Explanation:
 * Switch case cannot have value of type boolean. Only int values, strings or enum variables are permitted.
 * Therefore Option(a) changes the type from boolean to String.
 * 
 * Option b : cannot convert from int to boolean.
 * Option c : No change on compilation error.
 * Option d : No change on compilation error.
 * 
 * Additional Explanation: 
 * Switch case cannot have value of type boolean. Only int values, strings or enum variables are permitted.
 */
