package _02;
/*
 * Topic : Using Operators and Decision Constructors
 * Code: 02
 * 
 */

public class Question_17 {

	public static void main(String[] args) {
		int z = 100;
		int p = z++;
		int q = ++z;
		int r = z++;
		int s = ( p < q ) ? ( p < r ) ? p : ( q < r ) ? q : r : z;
		System.out.print(s);
	}

}



/*
 * What is the result of the code ?
 * 
 * a)
 * 100
 * 
 * b)
 * 101 
 *  
 * c)
 * 102
 *   
 * d)
 * 103
 * 
 * e)
 * Compilation Error 
 * 
 *   
 * Answer : 
 * a)
 * 100 	
 * 
 * Explanation:
 * This is tricky question
 * 
 * Before we start calculating the expression let us know the value if the variables z,p,q,r:
 *   z = 100 (Default Value)
 *   p = 100 (Post Increment z++, so p is initialized as 100 and then z  is incremented to 101 )
 * 	 q = 102 (Pre Increment ++z, so z  is incremented to 102 and then p is initialized as 102 )
 * 	 r = 102 (Post Increment z++, so p is initialized as 102 and then z  is incremented to 103 )
 * 	 
 * The expression is a ternary expression:
 * int s = ( p < q ) ? ( p < r ) ? p : ( q < r ) ? q : r : z;
 * contains three conditions :
 * (p < q) --> true
 * (p < r) --> true --> true statement : p
 * (q < r) --> not reached
 * 
 * So the answer is s = p which is 100
 * 
 * 
 * Additional Explanation: 
 * Ternary Equation 
 * 
 * Source : 
 * Actual Test 23
 * 
 */


