/*
 * Topic : Creating and using arrays
 * Code: 08
 * 
 */

public class Question_22 {

	public static void main(String[] args) {
		String[] fruits = {"Apples", "Mangoes", "Oranges", "Bananas"};
		
		System.out.println(fruits.length);
		System.out.println(fruits[1].length());
	}
}


/*
 * What is the output of the above ?
 * 
 * a)
 * 4
 * 7
 * 
 * b)
 * 3
 * 7
 *   
 * c)
 * 3
 * 6
 *   
 * d)
 * 4
 * 6
 *   
 * Answer : 
 * a)
 * 4
 * 7
 * 
 * 
 * Explanation:
 * The above code prints 4 and 7 respectively.
 * fruits.length --> length is a final variable applicable for arrays. With the help of length variable, we can obtain the size of the array.
 * fruits[1].length() -->  length() method is a final variable which is applicable for string objects. length() method returns the number of characters presents in the string. 
 * The index of array in java starts from 0, so the fruits[1] is 'Mangoes'.
 * 
 * Additional Explanation: 
 * https://www.geeksforgeeks.org/length-vs-length-java/
 * 
 * Source : 
 * Actual Test 41
 */


