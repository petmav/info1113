// massively overcomplicated weekday enum
// do not copy, just read, it wont even compile as individual versions of enum arent properly constructed
public abstract enum WeekDays {

    MONDAY {

        public void myDay() {
            System.out.println("I'm Monday.");
        }

    }, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; // translates to 0-6 array

    public void isWeekend() {
        if (this == SATURDAY || this == SUNDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }

    public void inDays(int days) {
        int index = this.ordinal(); // ordinal used to identify current index of enum
        int newIndex = (index + days) % 7; // modulo 7 is for week cycle
        System.out.println("In " + days + " days it will be " + WeekDays.values()[newIndex]); // values() used to get all values of enum, then get the value at the index through array pos syntax []
    }

    public abstract void myDay();
    
    public static void main(String[] args) {
        
        String day = args[0];
        int days = Integer.parseInt(args[1]);

        switch (day.toUpperCase()) {

            case "MONDAY": // if (day == "MONDAY")
                WeekDays.MONDAY.isWeekend();
                WeekDays.MONDAY.inDays(days);
                break;

            case "TUESDAY":
                WeekDays.TUESDAY.isWeekend();
                WeekDays.TUESDAY.inDays(days);
                break;

            case "WEDNESDAY":
                WeekDays.WEDNESDAY.isWeekend();
                WeekDays.WEDNESDAY.inDays(days);
                break;

            case "THURSDAY":
                WeekDays.THURSDAY.isWeekend();
                WeekDays.THURSDAY.inDays(days);
                break;

            case "FRIDAY":
                WeekDays.FRIDAY.isWeekend();
                WeekDays.FRIDAY.inDays(days);
                break;

            case "SATURDAY":
                WeekDays.SATURDAY.isWeekend();
                WeekDays.SATURDAY.inDays(days);
                break;

            case "SUNDAY":
                WeekDays.SUNDAY.isWeekend();
                WeekDays.SUNDAY.inDays(days);
                break;

            default:
                System.out.println("Invalid day.");

        }
    }

}


