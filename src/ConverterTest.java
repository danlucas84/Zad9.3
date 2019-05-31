import java.util.Scanner;

public class ConverterTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("podaj liczbe: ");
        int dayNumber = in.nextInt();
        int i;
        for (i = 1; dayNumber < 8; i++) {
            i = dayNumber;
        }
        System.out.println(CalandarConverter.MONDAY (dayNumber));
    }
}

