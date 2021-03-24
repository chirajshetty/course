/*
 * Topic : Working with Java Datatypes
 * Code: 07
 * 
 */

public class Question_29 {

	public static void main(String[] args) {
		int intValue = 100 ;
		float floatValue = 100.100f ;
		double doubleValue = 123;
		floatValue = intValue ;			//line 1 
		//intValue = floatValue ;			//line 2
		//floatValue = doubleValue ;		//line 3
		doubleValue = floatValue ;		//line 4
		//intValue = doubleValue ;		//line 5
		doubleValue = intValue ;		//line 6
	}
}

/*
 * Which three lines fails to compile? (Compile three)
 * 
 * a)
 * line 1 
 * 
 * b)
 * line 2
 *   
 * c)
 * line 3 
 *  
 * d)
 * line 4
 *   
 * e)
 * line 5
 * 
 * f)
 * line 6
 *   
 * Answer : 
 * b,c,e )
 * line 2,3,5
 * 
 * 
 * Explanation:
 * This question checks your understanding on Type Casting. The data types referred here are int, double, float. If we sort them according to their size : double > float > int.
 * In Java, there are two type of type casting :
 * 1. Widening Casting - converting a smaller type to a larger type size (which is done automatically).
 * 2. Narrowing/Down Casting - converting a larger type to a smaller size type (which has to specified).
 * 
 * In the given question,
 * Line 1,4,6 is an example of widening casting. Look how smaller datatype is instantiated to larger reference. 
 * example, floatValue = intValue ;	
 * The code compiles without any exception because widening casting is done automatically.
 *  
 * Line 2,3,5 is an example of narrow casting. Here larger datatype is instantiated to smaller reference without mentioning the type.
 * example, 
 * intValue = floatValue; // incorrect	
 * The code fails at compilation because narrow casting must be done manually.
 * intValue = (int)floatValue; // correct	
 * 
 * Additional Explanation: 
 * https://www.w3schools.com/java/java_type_casting.asp
 * 
 * Source : 
 * Actual Test 55
 */



