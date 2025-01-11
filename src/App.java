import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

    private static void checkHoliday(String date, List<Holiday> holidayList) {
        Date holidayDate;
        try {
            holidayDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            System.err.println("Data Enviada no formato não suportado");
            return;
        }

        for (int i = 0; i < holidayList.size(); i++) {
            if (holidayList.get(i).getHolidayDate().equals(holidayDate)) {
                System.out.println("Esse dia é o seguinte feriado: " + holidayList.get(i).getHolidayName() + ".");
                return;
            }
        }

        System.out.println("Não há feriados no dia: " + date + ".");

    }

    private static List<String> getHolidayNames(List<Holiday> holidayList) {
        List <String> holidayNames = new ArrayList<String>();
        for (int i=0; i < holidayList.size(); i++) {
            holidayNames.add(holidayList.get(i).getHolidayName());
        }
        return holidayNames;
    }

    public static void main(String[] args) throws Exception {
        List<Holiday> holidays = new ArrayList<Holiday>();
        String[] holidaysDates = new String[] {
                "01/01/2023",
                "21/02/2023",
                "17/04/2023",
                "21/04/2023",
                "01/05/2023",
                "08/06/2023",
                "07/09/2023",
                "12/10/2023",
                "02/11/2023",
                "15/11/2023",
                "25/12/2023",
                "06/02/2023"
        };
        String[] holidaysNames = new String[] {
                "Confraternização mundial",
                "Carnaval",
                "Páscoa",
                "Tiradentes",
                "Dia do trabalho",
                "Corpus Christi",
                "Independência do Brasil",
                "Nossa Senhora Aparecida",
                "Finados",
                "Proclamação da República",
                "Natal",
                "Aniverśario do Higor"
        };

        // Build holiday array
        for (int i = 0; i < holidaysDates.length; i++) {
            Holiday tempHoliday = new Holiday(holidaysDates[i], holidaysNames[i]);
            holidays.add(tempHoliday);
        }

        checkHoliday("06/02/2023", holidays);
        System.out.println(getHolidayNames(holidays));

    }
}
