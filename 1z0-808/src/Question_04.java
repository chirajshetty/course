/*
 * Topic : Working with Datatypes
 * Code: 07
 */

public class Question_04 {

	public static void main(String[] args) {
		Short t1 = 1200;
		Integer t2 = 400;
		Long t3 = (long) t1 + t2; // line 1 
		//String t4 = (String) (t3 * t2); // line 2
		//System.out.println("Sum is : " + t4);
	}

}

/*
 * What is the result of the following program?
 * 
 * a)
 * Sum is 1600
 * 
 * b)
 * Compilation fails on line 1
 *  
 * c)
 * Compilation fails on line 2
 * 
 * d)
 * A ClassCastException is thrown at line 1
 * 
 * e)
 * A ClassCastException is thrown at line 2
 * 
 *  
 * Answer : 
 * c)
 * Compilation Error on line 2
 * 
 * Explanation:
 * long is a primitive datatype and cannot be casted into String which is Object(or Non-Primitive) DataType.
 * The following is a compilation error since the error at the time of compilation.
 * ClassCastException is a runtime exception raised in Java when we try to improperly cast a class from one type to another. It's thrown to indicate that the code has attempted to cast an object to a related class, but of which it is not an instance.
 * 
 * Additional Explanation: 
 * ClassCastException is a runtime exception raised in Java when we try to improperly cast a class from one type to another. 
 * In this case it is not a runtime exception but a compiler error.
 */
