public class CalandarConverter {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;
    private static int dayNumber;

    public static convertDayToString(int dayNumber) {


        switch (dayNumber) {
            case MONDAY:
                System.out.println(dayNumber + " dzien tygodnia to poniedzialek");
                return CalandarConverter.MONDAY;
            break;

            case TUESDAY:
                System.out.println(dayNumber + " dzien tygodnia to wtorek");
                break;
            case WEDNESDAY:
                System.out.println(dayNumber + "dzien tygodnia to sroda");
                break;
            case THURSDAY:
                System.out.println(dayNumber + "dzien tygodnia to czwartek");
                break;
            case FRIDAY:
                System.out.println(dayNumber + "dzien tygodnia to piatek");
                break;
            case SATURDAY:
                System.out.println(dayNumber + "dzien tygodnia to sobota");
                break;
            case SUNDAY:
                System.out.println(dayNumber + "dzien tygodnia to niedziela");
                break;
            default:
        }
    }
}