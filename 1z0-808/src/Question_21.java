/*
 * Topic : Working with Selected classes from the Java API
 * Code: 05 
 * 
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question_21 {
	
	public static void main(String args[]) {
		LocalDate date1 = LocalDate.now();
		//LocalDate date2 = LocalDate.of(8, 29, 2020);
		LocalDate date3 = LocalDate.parse("2020-08-29", DateTimeFormatter.ISO_DATE);
		
		System.out.println("Date 1 = " + date1);
		//System.out.println("Date 2 = " + date2);
		System.out.println("Date 3 = " + date3);
	}
}


/*
 * What is the result of the code assuming that system date is August 29,2020 ?
 * 
 * a)
 * Date 1 = 2020-08-29
 * Date 2 = 2020-08-29
 * Date 3 = 2020-08-29
 * 
 * b)
 * Date 1 = 29/08/2020 
 * Date 2 = 2020-08-29
 * Date 3 = Aug 29,2020
 *   
 * c)
 * Runtime Exception
 *   
 * d)
 * Compilation Fail.
 *
 *   
 * Answer : 
 * d)
 * 0 2 4 6
 * 
 * Explanation:
 * The line --> LocalDate date2 = LocalDate.of(8, 29, 2020); has syntax error.
 * LocalDate.of(int year, int month, int DayOfMonth) format which does not match with the above line.
 * 
 * 
 * 
 * Additional Explanation: 
 * Invalid value for MonthOfYear (valid values 1 - 12): 29
 */


