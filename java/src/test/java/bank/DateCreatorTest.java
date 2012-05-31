package bank;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

public class DateCreatorTest {

    @Test
    public void should_parse_correctly() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2012, 4, 12, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date expected = calendar.getTime();

        assertEquals(expected, DateCreator.date("12-May-2012", Locale.ENGLISH));
    }
}
