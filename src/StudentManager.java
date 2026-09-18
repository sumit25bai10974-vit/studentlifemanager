import java.util.*;

public class StudentManager {

    private Student student;
    private List<Course> courses;
    private List<Expense> expenses;
    private FileManager fileManager;

    public StudentManager() {
        courses = new ArrayList<>();
        expenses = new ArrayList<>();
        fileManager = new FileManager();

        student = fileManager.loadStudent();
        courses.addAll(fileManager.loadCourses());
        expenses.addAll(fileManager.loadExpenses());
    }

    public void studentMenu(Scanner sc) {
        while (true) {
            System.out.println("\n--- STUDENT PROFILE ---");
            System.out.println("1. Create / Update Profile");
            System.out.println("2. View Profile");
            System.out.println("0. Back");

            int choice = InputHelper.readInt(sc, "Enter choice: ");

            if (choice == 1) {
                String name = InputHelper.readText(sc, "Name: ");
                String roll = InputHelper.readText(sc, "Roll Number: ");
                String branch = InputHelper.readText(sc, "Branch: ");
                int sem = InputHelper.readInt(sc, "Semester: ");

                student = new Student(name, roll, branch, sem);
                System.out.println("Profile updated.");

            } else if (choice == 2) {
                if (student == null)
                    System.out.println("Profile not found.");
                else
                    System.out.println(student);

            } else if (choice == 0) {
                return;
            }
        }
    }

    public void courseMenu(Scanner sc) {
        while (true) {
            System.out.println("\n--- COURSE MANAGEMENT ---");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Calculate CGPA");
            System.out.println("4. Remove Course");
            System.out.println("0. Back");

            int choice = InputHelper.readInt(sc, "Enter choice: ");

            if (choice == 1) {
                String code = InputHelper.readText(sc, "Course Code: ");
                String name = InputHelper.readText(sc, "Course Name: ");
                int credits = InputHelper.readInt(sc, "Credits: ");
                double marks = InputHelper.readDouble(sc, "Marks: ");

                if (credits > 0 && marks >= 0 && marks <= 100) {
                    courses.add(new Course(code, name, credits, marks));
                    System.out.println("Course added.");
                } else {
                    System.out.println("Invalid data.");
                }

            } else if (choice == 2) {
                showCourses();

            } else if (choice == 3) {
                System.out.printf("CGPA: %.2f%n", calculateCGPA());

            } else if (choice == 4) {
                String code = InputHelper.readText(sc, "Course Code: ");
                boolean removed = courses.removeIf(
                        c -> c.getCode().equalsIgnoreCase(code));

                System.out.println(removed ? "Course removed." : "Course not found.");

            } else if (choice == 0) {
                return;
            }
        }
    }

    private void showCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        System.out.println("\nCode       Name                      Credits Marks   Grade Point");

        for (Course c : courses)
            System.out.println(c);
    }

    public double calculateCGPA() {
        if (courses.isEmpty()) return 0;

        double points = 0;
        int credits = 0;

        for (Course c : courses) {
            points += c.getGradePoint() * c.getCredits();
            credits += c.getCredits();
        }

        return points / credits;
    }

    public void expenseMenu(Scanner sc) {
        while (true) {
            System.out.println("\n--- EXPENSE MANAGER ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Expense Summary");
            System.out.println("4. Delete Expense");
            System.out.println("0. Back");

            int choice = InputHelper.readInt(sc, "Enter choice: ");

            if (choice == 1) {
                String category = InputHelper.readText(sc, "Category: ");
                double amount = InputHelper.readDouble(sc, "Amount: ");

                if (amount > 0) {
                    expenses.add(new Expense(category, amount));
                    System.out.println("Expense added.");
                }

            } else if (choice == 2) {
                for (int i = 0; i < expenses.size(); i++)
                    System.out.printf("%d. %s - %.2f%n",
                            i + 1,
                            expenses.get(i).getCategory(),
                            expenses.get(i).getAmount());

            } else if (choice == 3) {
                double total = 0;

                for (Expense e : expenses)
                    total += e.getAmount();

                System.out.printf("Total Expense: %.2f%n", total);

            } else if (choice == 4) {
                int n = InputHelper.readInt(sc, "Expense number: ");

                if (n >= 1 && n <= expenses.size()) {
                    expenses.remove(n - 1);
                    System.out.println("Expense deleted.");
                }

            } else if (choice == 0) {
                return;
            }
        }
    }

    public void showDashboard() {
        System.out.println("\n========== DASHBOARD ==========");

        if (student == null)
            System.out.println("Student: Profile not created");
        else
            System.out.println("Student: " + student.getName());

        System.out.println("Total Courses: " + courses.size());
        System.out.printf("CGPA: %.2f%n", calculateCGPA());

        double total = 0;

        for (Expense e : expenses)
            total += e.getAmount();

        System.out.printf("Total Expenses: %.2f%n", total);

        System.out.println("===============================");
    }

    public void saveAll() {
        fileManager.saveStudent(student);
        fileManager.saveCourses(courses);
        fileManager.saveExpenses(expenses);
    }
}