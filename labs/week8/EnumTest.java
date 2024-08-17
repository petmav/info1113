public class EnumTest {
    
     public static void main(String[] args) {

        String day = args[0];
        day = day.toUpperCase();

        WeekDays day = WeekDays.MONDAY;

        if (day == "SATURDAY" || day == "SUNDAY") {
            System.out.println("Weekend")
        } else {
            System.out.println("Weekday")
        }
     }
}
