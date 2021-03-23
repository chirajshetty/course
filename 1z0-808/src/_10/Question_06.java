package _10;
/*
 * Topic : Handling Exception
 * Code: 010
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question_06 {
	
	public static void main(String args[]) {
		
		String date = LocalDate.parse("2020-08-04")
				.format(DateTimeFormatter.ISO_DATE_TIME);
		
		System.out.println(date);
		
	}

}


/*
 * What is the result of the following program?
 * 
 * a)
 * August 04, 2020T00:00:00.000
 * 
 * b)
 * An exception is thrown at runtime
 *  
 * c)
 * 2020-08-04T00:00: 00.000
 * 
 * d)
 * 8/4/20T00:00:00.000
 * 
 * Answer : 
 * b)
 * An exception is thrown at runtime 
 * 
 * Output :
 * Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
	at java.base/java.time.LocalDate.get0(LocalDate.java:709)
	at java.base/java.time.LocalDate.getLong(LocalDate.java:688)
	at java.base/java.time.format.DateTimePrintContext.getValue(DateTimePrintContext.java:308)
	at java.base/java.time.format.DateTimeFormatterBuilder$NumberPrinterParser.format(DateTimeFormatterBuilder.java:2704)
	at java.base/java.time.format.DateTimeFormatterBuilder$CompositePrinterParser.format(DateTimeFormatterBuilder.java:2343)
	at java.base/java.time.format.DateTimeFormatterBuilder$CompositePrinterParser.format(DateTimeFormatterBuilder.java:2343)
	at java.base/java.time.format.DateTimeFormatterBuilder$CompositePrinterParser.format(DateTimeFormatterBuilder.java:2343)
	at java.base/java.time.format.DateTimeFormatter.formatTo(DateTimeFormatter.java:1847)
	at java.base/java.time.format.DateTimeFormatter.format(DateTimeFormatter.java:1821)
	at java.base/java.time.LocalDate.format(LocalDate.java:1817)
	at Question_06.main(Question_06.java:13)
 * 
 * Explanation :
 * The following program throws -  java.time.temporal.UnsupportedTemporalTypeException at RunTime.
 * Thus a runtime exception.
 * The following exception has occurred because of formating a LocalDate object to LocalDateTime object.
 *  
 * Additional Explanation: 
 * Unsupported field: HourOfDay is required which is not present in the LocalDate object.
 * 
 * Source : 
 * Actual TEst 3
 */


