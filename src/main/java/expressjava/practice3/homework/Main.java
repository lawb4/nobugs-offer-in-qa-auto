package expressjava.practice3.homework;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Ivan");
        Company employee2 = new Company(2, "Anna");
        Company.companyName = "Google";
        Company.printCompanyName();
        //employee2.employeeID = 3; // compilation error

        System.out.println(MathConstants.calculateCircleArea(2d));
        System.out.println(MathConstants.calculateCircumference(3d));

        University student1 = new University(1, "Ivan");
        student1.printStudentInfo();

        University student2 = new University(2, "Anna");
        University.universityName = "Harvard";
        student2.printStudentInfo();

        University student3 = new University(3, "Max");
        University.changeUniversityName("Standford");
        student3.printStudentInfo();

    }
}
