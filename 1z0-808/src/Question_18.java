/*
 * NOT COMPLETED 
 * Topic : 
 * Code: 
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
 ** 
 *   
 * Answer : 
 * a)
 * [Tom, Jimmy, Ellen] 	
 * 
 * Explanation:
 * 
 * 
 * Additional Explanation: 
 */

