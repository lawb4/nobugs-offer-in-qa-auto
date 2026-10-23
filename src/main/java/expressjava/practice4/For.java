package expressjava.practice4;

public class For {
    public static void main(String[] args) {
        printNumbersDivisiblebyThree();
    }

    public static void printNumbersDivisiblebyThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
