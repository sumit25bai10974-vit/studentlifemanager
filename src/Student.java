public class Student {
    private String name, rollNumber, branch;
    private int semester;

    public Student(String name, String rollNumber, String branch, int semester) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.semester = semester;
    }

    public String getName() { return name; }
    public String getRollNumber() { return rollNumber; }
    public String getBranch() { return branch; }
    public int getSemester() { return semester; }

    public String toString() {
        return "Name: " + name +
               "\nRoll Number: " + rollNumber +
               "\nBranch: " + branch +
               "\nSemester: " + semester;
    }
}