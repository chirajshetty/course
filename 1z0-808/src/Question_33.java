/*
 * NOT COMPLETED
 * Topic : Working with inheritance 
 * Code: 04
 */

interface Movable {
	public void drive();
	//public void mileage();
}

abstract class Cars implements Movable {		//line 1 
	public void drive() {System.out.print("Cars");}		
	// line 2 
}

class ElectricCars extends Cars {		//line 3
	public void drive() {System.out.print("ElectricCars");}		
	// line 4
}

public class Question_33 {

	public static void main(String[] args) {
		Cars car1 = new ElectricCars();
		car1.drive();
	}
}



/*
 * Which option enables the code to compile ?
 * 
 * a)
 * Replace line 1 with : class Cars implements Movable {
 * 
 * b)
 * Insert at line 2 : public abstract void mileage();
 * 
 * c)
 * Replace line 3 with : abstract class ElectricCars extends Cars {
 * 
 * d)
 * Insert at line 4 : public void mileage();
 * 
 * Answer : 
 * d)
 * Insert at line 4 : public void mileage(); 
 * 
 * Explanation: 
 * 
 * Additional Explanation: 
 */
