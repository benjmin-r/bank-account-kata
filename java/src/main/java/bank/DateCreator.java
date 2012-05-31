package bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateCreator {

    public static Date date(String dateString) throws ParseException {
        return DateCreator.date(dateString, Locale.getDefault());
    }

    public static Date date(String dateString, Locale locale) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy", locale);
        return sf.parse(dateString);
    }
}
