package _04;
/*
 * Topic : Working with Inheritance 
 * Code: 04 
 * 
 */

class Computer{
	String processor = "Intel";
	int RAM = 4;

	Computer() {}
	
	Computer(String processor, int RAM){
		this.processor = processor;
		this.RAM = RAM;
	}
}

class Laptop extends Computer{
	String type;

	Laptop(String type) {		//line 1
		this.type = type;
	}

	Laptop(String processor, int RAM, String type) {
		super(processor, RAM);		//line2
		this.type = type;
	}	
}

public class Question_10 {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("LED");
		Laptop l2 = new Laptop("Intel",8,"LED");
		System.out.println(l1.processor + " " + l1.RAM + " " + l1.type );
		System.out.println(l2.processor + " " + l2.RAM + " " + l2.type );
		
	}

}


/*
 * What is the result of the following code?
 * 
 * a)
 * Intel 4 LED
 * Intel 8 LED
 * 
 * b)
 * null 0 LED
 * Intel 8 LED
 *  
 * c)
 * Compilation fail at line 1
 * 
 * d)
 * Compilation fail at line 2
 * 
 * e)
 * Compilation fail at both line 1 and  line 2
 * 
 * Answer : 
 * a)
 * Intel 4 LED
 * Intel 8 LED
 * 
 * Explanation:
 * The code compiles and runs without any issue, so options C,D,E are incorrect. 
 * Since the instance variables are predefined, therefore the output of l1 will be - Intel 4 LED.
 * So option B is also incorrect. 
 * 
 * Additional Explanation: 
 * This is a simple case of inheritance where Laptop extends Computer. The object Laptop thus created has access to instance variables of Computer.
 * 
 * Source :
 * Actual Test 7  
 */



