/*
 * Topic : Working with Inheritance
 * Code: 04
 */


class Product{
	double price;
}

public class Test {
	
	public void updatePrice(Product product , double price) {
		price *= 2;
		product.price += price;
	}

	public static void main(String[] args) {
		Product pdt = new Product();
		pdt.price = 200;
		double newPrice = 100;
		
		Test ts = new Test();
		ts.updatePrice(pdt, newPrice);
		System.out.println(pdt.price+" : "+ newPrice);

	}
}

/*
 * What is the output of the code?
 * 
 * a) 
 * 200.0:100.0
 * 
 * b) 
 * 400.0:200.0
 * 
 * c)
 * 400.0:100.0
 * 
 * d)
 * Compilation Failed 
 * 
 * Answer : 
 * c)
 * 400.0:100.0
 * 
 * Explanation: 
 * Simple example of inheritance. 
 * The parameter double price in the method updatePrice(Product product,double price) is a copy of the newPrice variable passed in the method.
 * So any changes or modifications to the formal parameter variable inside the called function or method affect only the separate storage location and will not be reflected in the actual parameter in the calling environment.
 * This concept is called "Pass by Value"
 * 
 * Additional Explanation: 
 * Call by reference(aliasing): Changes made to formal parameter do get transmitted back to the caller through parameter passing. Any changes to the formal parameter are reflected in the actual parameter in the calling environment as formal parameter receives a reference (or pointer) to the actual data. 
 */
