package expressjava.practice3.homework;

public class University {
    static String universityName = "Local University";
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return studentName;
    }

    void printStudentInfo() {
        System.out.printf("Student name: %s, ID: %d, university: %s\n", studentName, studentID, universityName);
    }
}
