package expressjava.practice2.homework.test;

/*Создайте класс BankAccount с полями owner и balance. Реализуйте конструктор, геттеры, сеттер для владельца, методы deposit(amount) и withdraw(amount) и метод printBalance(). В main внесите деньги, снимите и выведите баланс.*/
public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
            this.balance -= amount;
    }

    public void printBalance() {
        System.out.printf("Current balance: %.2f\n", balance);
    }
}
