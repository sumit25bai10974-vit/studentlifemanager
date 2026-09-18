public class Course {
    private String code, name;
    private int credits;
    private double marks;

    public Course(String code, String name, int credits, double marks) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.marks = marks;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public int getCredits() { return credits; }
    public double getMarks() { return marks; }

    public double getGradePoint() {
        if (marks >= 90) return 10;
        if (marks >= 80) return 9;
        if (marks >= 70) return 8;
        if (marks >= 60) return 7;
        if (marks >= 50) return 6;
        if (marks >= 40) return 5;
        return 0;
    }

    public String toString() {
        return String.format("%-10s %-25s %-7d %-7.2f %.1f",
                code, name, credits, marks, getGradePoint());
    }
}