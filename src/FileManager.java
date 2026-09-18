import java.io.*;
import java.util.*;

public class FileManager {

    public void saveStudent(Student s) {
        try {
            PrintWriter p = new PrintWriter("student.txt");

            if (s != null) {
                p.println(s.getName());
                p.println(s.getRollNumber());
                p.println(s.getBranch());
                p.println(s.getSemester());
            }

            p.close();
        } catch (Exception e) {
            System.out.println("Error saving student.");
        }
    }

    public Student loadStudent() {
        try {
            File f = new File("student.txt");
            if (!f.exists()) return null;

            BufferedReader b = new BufferedReader(new FileReader(f));

            String name = b.readLine();
            String roll = b.readLine();
            String branch = b.readLine();
            int semester = Integer.parseInt(b.readLine());

            b.close();

            return new Student(name, roll, branch, semester);

        } catch (Exception e) {
            return null;
        }
    }

    public void saveCourses(List<Course> courses) {
        try {
            PrintWriter p = new PrintWriter("courses.txt");

            for (Course c : courses) {
                p.println(c.getCode() + "|" + c.getName() + "|" +
                          c.getCredits() + "|" + c.getMarks());
            }

            p.close();
        } catch (Exception e) {
            System.out.println("Error saving courses.");
        }
    }

    public List<Course> loadCourses() {
        List<Course> list = new ArrayList<>();

        try {
            File f = new File("courses.txt");
            if (!f.exists()) return list;

            BufferedReader b = new BufferedReader(new FileReader(f));
            String line;

            while ((line = b.readLine()) != null) {
                String[] x = line.split("\\|");

                if (x.length == 4) {
                    list.add(new Course(
                            x[0],
                            x[1],
                            Integer.parseInt(x[2]),
                            Double.parseDouble(x[3])
                    ));
                }
            }

            b.close();
        } catch (Exception e) {
            System.out.println("Error loading courses.");
        }

        return list;
    }

    public void saveExpenses(List<Expense> expenses) {
        try {
            PrintWriter p = new PrintWriter("expenses.txt");

            for (Expense e : expenses) {
                p.println(e.getCategory() + "|" + e.getAmount());
            }

            p.close();
        } catch (Exception e) {
            System.out.println("Error saving expenses.");
        }
    }

    public List<Expense> loadExpenses() {
        List<Expense> list = new ArrayList<>();

        try {
            File f = new File("expenses.txt");
            if (!f.exists()) return list;

            BufferedReader b = new BufferedReader(new FileReader(f));
            String line;

            while ((line = b.readLine()) != null) {
                String[] x = line.split("\\|");

                if (x.length == 2) {
                    list.add(new Expense(
                            x[0],
                            Double.parseDouble(x[1])
                    ));
                }
            }

            b.close();
        } catch (Exception e) {
            System.out.println("Error loading expenses.");
        }

        return list;
    }
}