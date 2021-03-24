package _05;
/*
 * Topic : Working with Selected Classes with Java API
 * Code: 05
 * 
 */

public class Question_12_v2 {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("OCA");
		String str = "OCA";
		
		if (!stb.toString().equals(str.toString())) {
			System.out.println("First Match");
		}
		else if(stb.equals(str)) {
			System.out.println("Second Match");
		}
		else {
			System.out.println("No Match");
		}
	}
}

/*
 * What is the output of the following code snippet?
 * 
 * a)
 * First Match
 * 
 * b)
 * Second Match
 *  
 * c)
 * No Match
 *  
 * d)
 * Runtime Exception
 * 
 * Answer : 
 * c)
 * No Match
 * 
 * Explanation:
 * The toString() method of the StringBuilder class reruns String value of the current object.
 * Therefore, the string value of stb.toString() and str.toString() are both of type String and comparable
 * and in this case are true. But because of the ! operator the condition is false.
 * 
 * A point to note: 
 * equals() method is used for comparing two strings in Java since the String class overrides Object class, while Stringbuilder doesn`t override.
 * So the second if condition is false. 
 * Moreover equals() method cannot be used to compare StringBuilder with StringBuilder as well.
 * 
 * Additional Explanation: 
 * https://www.tutorialspoint.com/converting-a-stringbuilder-to-string-in-java
 * 
 * Source : 
 * Actual Test 10
 * 
 */




