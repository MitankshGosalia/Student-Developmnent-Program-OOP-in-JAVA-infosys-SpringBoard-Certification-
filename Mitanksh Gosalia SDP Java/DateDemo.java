import java.time.localDate;
public class DateDemo
{
    public static void main(String[] args)
    {
    LocalDate date = LocalDate.parse("2019-03-07");
    LocalDate date1 = Localdate.of(2019,12,07);
    System.out.println("date.getYear()+date1.getYear()+ "," +date.compareTo(date1)+" , "+date1.compareTo(date));
    }
}