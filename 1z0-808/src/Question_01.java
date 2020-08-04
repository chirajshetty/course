/*
 * Topic : Working with Data Types 
 * Code: 07
 */


public class Question_01 {

	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer sum is "+(x+y));
	}

	public static void doSum(double x, double y) {
		System.out.println("Double sum is "+(x+y));
	}

	public static void doSum(float x, float y) {
		System.out.println("Float sum is "+(x+y));
	}

	public static void main(String[] args) {
		doSum(10, 20);
		doSum(10.0, 20.0);
	}

}

/*
 * What is the output of the code?
 * 
 * a) 
 * Integer sum is 30.0
 * Double sum is 30.0
 * 
 * b) 
 * Integer sum is 30.0
 * Float sum is 30.0
 * 
 * c)
 * Integer sum is 30.0
 * Integer sum is 30.0
 * 
 * d)
 * Float sum is 30.0
 * Double sum is 30.0
 * 
 * Answer : 
 * d)
 * Float sum is 30.0
 * Double sum is 30.0
 * 
 * Explanation: 
 * This is an example of Method Overloading:
 * 
 * The first line doSum(10, 20) in the main method has 'int'(Primitive Type) arguments but the first  
 * method calls 'Integer'(reference Type). 
 * Since there is no integer argument  method it finds the next through 'type promotion' and finds float argument method.
 * 
 * The second line doSum(10.0, 20.0) in the main method has double arguments and therefore calls the doSum(double x, double y) method.
 * 
 * Additional Explanation: 
 * to call doSum(float x, float y) method we need to specify doSum(10.0f, 20.0f)
 */