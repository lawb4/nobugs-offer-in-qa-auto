package expressjava.practice3.homework.test;

public class University {

    static String universityName = "University";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.printf("Student name: %s, student id: %d, university: %s\n",
                studentName,
                studentID,
                universityName);
    }
}
