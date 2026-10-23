package expressjava.practice3.homework;

public class University {
    static String universityName = "Local University";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.printf("Student name: %s, ID: %d, university: %s\n", studentName, studentID, universityName);
    }
}
