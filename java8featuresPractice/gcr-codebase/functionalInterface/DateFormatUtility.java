package FunctionalInterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public interface DateFormatUtility {
   
	static String formatDate(LocalDate date, String pattern) {
		DateTimeFormatter form=DateTimeFormatter.ofPattern(pattern);
		
		return date.format(form);
	}
}
