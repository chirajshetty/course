/*
 * Topic : Working with Selected Classes from the Java API
 * Code: 05
 * 
 */
public class Question_08 {

	public static void main(String[] args) {
		String str1 = "A ";
		str1 = str1.concat("B ");
		String str2 = "C ";
		str1 = str1.concat(str2);
		str1.replace('C', 'D');
		str1 = str1.concat(str2);
		System.out.print(str1);
	}

}

/*
 * What is the output of the following code?
 * 
 * a)
 * A B C D 
 * 
 * b)
 * A C D 
 *  
 * c)
 * A B D D  
 * 
 * d)
 * A B C C 
 * 
 * e)
 * A B D C
 * 
 * Answer : 
 * d)
 * A B C C 
 * 
 * Explanation:
 * The code does the following steps:
 * Step1 : String object with reference str1 is created and "A " is stored in the str1
 * 			str1 = "A "
 * Step2 : str1 is concatenated with "B " and str1 is updated with the new value of the operation.
 * 			str1 = "A B "
 * Step3 : String object with reference str2 is created and "C " is stored in the str2
 * 			str1 = "A "  str2 = "C "
 * Step4 : str1 is concatenated with str2 and str1 is updated with the new value of the operation.
 * 			str1 = "A B C "  str2 = "C "
 * Step5 : 'C' is replaced with 'D' in str1 but no updation is done.
 * 			str1 = "A B C "  str2 = "C "
 * Step6 : str1 is concatenated with str2 again and str1 is updated with the new value of the operation.
 * 			str1 = "A B C C "  str2 = "C "
 * Step7 : str1 is printed out on the console - A B C C
 * 
 * 
 * Additional Explanation: 
 * String is Immutable class refer string immutable class 
 * 
 */

