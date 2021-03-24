package _05;
/*
 * Topic : Working with Java APIs
 * Code: 05 
 * 
 */

public class Question_27 {

	public static void main(String[] args) {
		String[] arr = new String[2];
		arr[0]="a";
		arr[1]="b";
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
 * Output : 
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.concat(String)" because "arr[id]" is null
	at Question_27.main(Question_27.java:13)
 *  
 * Explanation:
 * Option d is the correct answer.
 * The program cannot execute the statement "String.concat(String)" because "arr[id]" is null,
 * hence the program throws an NullPointerException which is a runtime exception. 
 * 
 * Additional Explanation: 
 * If the array contained two strings example 'a' and 'b', then the output will be a and b. 
 * The arr[id].concat(" Word "+ id); is not executed since it is not declared to a String variable. arr[id].concat(" Word "+ id);
 * 
 * Source : 
 * Actual Test 52
 * 
 */
