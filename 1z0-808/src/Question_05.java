/*
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
 * The variable str in the try block is a local variable.
 * The Scope of Local variables is only within the methods/blocks/constructors in which they are declared or defined and are destroyed after the execution of it.  
 * 
 * Therefore variable str called in line --> System.out.print("str: 	"+str+"	num:	"+num);
 * calls the instance variable and not the local variable in the try block.
 * 
 * Additional Explanation:
 * https://www.tutorialspoint.com/why-variables-defined-in-try-cannot-be-used-in-catch-or-finally-in-java#:~:text=Variables%20in%20try%20block,in%20a%20block%2C%20outside%20it. 
 */
