package expressjava.practice2.homework.test;

/*Создайте класс Car с полями brand (строка) и year (целое число). Реализуйте конструктор с двумя параметрами, геттеры и сеттеры для обоих полей, метод print(), выводящий информацию о марке и годе выпуска. В main создайте объект, установите значения через конструктор, измените год через сеттер, выведите информацию.*/
public class Car {

    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.printf("Brand: %s, Year: %d\n", brand, year);
    }
}
