package baba;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Dateconstarints {
	 public static boolean isValidDate(String date, String format) {
 SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(isValidDate("20-08-2023", "dd-MM-yyyy"));  // true
        System.out.println(isValidDate("2023/08/20", "yyyy/MM/dd"));  // true
        System.out.println(isValidDate("2023-08-32", "yyyy-MM-dd"));  // false
	}

}

