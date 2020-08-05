/*
 * NOT COMPLETE
 * Topic : Handling Exception
 * Code: 010
 * 
 */

public class Question_05 {
	
	String str = "1234";
	
	public void displayValue(String str1) {
		int num = 0;
		try {
			String str = str1;
			num = Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.err.println("Error");			
		}
		System.out.print("str: 	"+str+"	num:	"+num);
		
	}
	
	public static void main(String args[]) {
		Question_05 app = new Question_05();
		app.displayValue("5678");
	}
	

}

/*
 * What is the result of the following program?
 * 
 * a)
 * str: 5678 num: 1234
 * 
 * b)
 * str: 5678 num: 5678
 *  
 * c)
 * Error
 * 
 * d)
 * str: 1234 num: 5678
 * 
 * Answer : 
 * d)
 * str: 1234 num: 5678
 * 
 * Explanation:
 *  
 * Additional Explanation: 
 */
