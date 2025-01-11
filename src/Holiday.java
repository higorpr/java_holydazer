import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Holiday {
    private Date holidayDate;
    private String holidayName;

    public Holiday(String holidayDate, String holidayName) {
        setHolidayDate(holidayDate);
        this.holidayName = holidayName;
    }

    public Date getHolidayDate() {
        return holidayDate;
    }
    private void setHolidayDate(String holidayDate) {
        try {
            this.holidayDate = new SimpleDateFormat("dd/MM/yyyy").parse(holidayDate);
        } catch (ParseException e) {
            System.err.println(e);
        }
        
    }
    public String getHolidayName() {
        return holidayName;
    }
    
}
