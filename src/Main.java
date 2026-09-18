import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        System.out.println("==================================");
        System.out.println("       STUDENT LIFE MANAGER");
        System.out.println("==================================");

        boolean running = true;

        while (running) {
            System.out.println("\n1. Student Profile");
            System.out.println("2. Course Management");
            System.out.println("3. Expense Manager");
            System.out.println("4. Dashboard");
            System.out.println("5. Save Data");
            System.out.println("0. Exit");

            int choice = InputHelper.readInt(sc, "Enter choice: ");

            switch (choice) {
                case 1:
                    manager.studentMenu(sc);
                    break;
                case 2:
                    manager.courseMenu(sc);
                    break;
                case 3:
                    manager.expenseMenu(sc);
                    break;
                case 4:
                    manager.showDashboard();
                    break;
                case 5:
                    manager.saveAll();
                    System.out.println("Data saved successfully.");
                    break;
                case 0:
                    manager.saveAll();
                    System.out.println("Data saved. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
