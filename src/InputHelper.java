import java.util.Scanner;

public class InputHelper {

    public static int readInt(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    public static double readDouble(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Enter a valid amount.");
            }
        }
    }

    public static String readText(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }
}