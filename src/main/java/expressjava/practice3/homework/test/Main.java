package expressjava.practice3.homework.test;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Ivan");
        Company employee2 = new Company(2, "Hanna");

        Company.companyName = "Google";

        System.out.printf("Employee: %s, Company: %s\n", employee1.getEmployeeName(), Company.companyName);
        System.out.printf("Employee: %s, Company: %s\n", employee2.getEmployeeName(), Company.companyName);
        //employee1.employeeID = 2; // compile error

        System.out.printf("Circle area: %f\n", MathConstants.calculateCircleArea(2));
        System.out.printf("Circle circumference: %f", MathConstants.calculateCircumference(3));

        University student1 = new University(1, "Ivan");
        University student2 = new University(2, "Hanna");
        University student3 = new University(3, "Victor");
        University.changeUniversityName("Stanford");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        GameSettings game1 = new GameSettings("Dota 2", 9);
        GameSettings game2 = new GameSettings("League of Legends", 8);
        GameSettings.setMaxPlayers(12);
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

        Person person1 = new Person("Ivan", "Ivanov", "123-123");
        Person person2 = new Person("Hanna", "Ivanova", "123-124");
        person1.setFirstName("Juan");
        person1.printPersonInfo();
        person2.printPersonInfo();
    }
}
