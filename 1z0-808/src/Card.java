/*
 * NOT COMPLETED 
 * Topic : 
 * Code: 
 * 
 */

public class Card {

	void scanCard(int cardNo) throws Exception {
		System.out.print("Scanning Card");
	}

	void validateCard(int cardNo) throws RuntimeException{ //line1
		System.out.print("Validate Card");
	}

	public static void main(String[] args) {
		Card card = new Card();
		int cardNo = 2457;
		//card.scanCard(cardNo);			//line2
		card.validateCard(cardNo);		//line3
	}

}

/*
 * What is the output of the following code snippet?
 * 
 * a)
 * Scanning Card Validate Card
 * 
 * b)
 * Compilation fails at line 1 
 *  
 * c)
 * Compilation fails at line 2 
 *  
 * d)
 * Compilation fails at line 3 
 * 
 * Answer : 
 * c)
 * Compilation fails at line 2 
 * 
 * Explanation:
 * 
 * 
 * Additional Explanation: 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type Exception

	at Card.main(Card.java:21)
 */