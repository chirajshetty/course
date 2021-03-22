/*
 * Topic : Working with Selected classes from the Java API
 * Code: 05 
 * 
 */

import java.util.*;

public class Question_18 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Tom");
		list.add("Ellen");
		list.add("Jimmy");
		list.add("Ellen");
		
		if(list.remove("Ellen")) {
			list.remove("Jim");
		}
		System.out.print(list);
	}

}

/*
 * What is the result of the code ?
 * 
 * a)
 * [Tom, Jimmy, Ellen]
 * 
 * b)
 * [Tom, Jimmy] 
 *  
 * c)
 * [Tom, Ellen, Jimmy, Ellen]
 *   
 * d)
 * Runtime Exception
 *   
 * Answer : 
 * a)
 * [Tom, Jimmy, Ellen] 	
 * 
 * Explanation:
 * The code compiles without any error, so Option D is incorrect.
 * The ArrayList remove()
 * The remove() method is overloaded and comes in two variants:
 * 1. boolean remove(Object o) – removes the first occurrence of the specified element from the list. Returns true is any element was removed from the list, else false and the list remains unchanged.
 * 2. Object remove(int index) throws IndexOutOfBoundsException – removes the element at the specified position in this list. Shifts any subsequent elements to the left. Returns the removed element from the list. Throws exception if argument index is invalid.
 * 
 * Here we call the first variant so if condition returns a boolean value.
 * The element "Jim" is not present in the list so the list remains unchanged.
 * 
 * Additional Explanation: 
 * https://www.tutorialspoint.com/java/util/arraylist_remove_object.htm
 * 
 * Source :
 * Actual Test 26
 */

