package expressjava.practice2.homework.test;

/*Создайте класс StudentGroup с полями groupName и studentCount. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о группе и количестве студентов. В main измените число студентов и выведите информацию.*/
public class StudentGroup {

    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void printInfo() {
        System.out.printf("Student group name: %s, student count: %d\n", groupName, studentCount);
    }
}
