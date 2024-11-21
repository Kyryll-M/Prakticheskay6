import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість кутів багатокутника: ");
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.println("Багатокутник має містити щонайменше 3 кути.");
        } else {
            int[] angles = new int[n];
            int sumOfAngles = 0;
            System.out.println("Введіть кути багатокутника:");
            for (int i = 0; i < n; i++) {
                angles[i] = scanner.nextInt();
                sumOfAngles += angles[i];
            }
            int expectedSum = 180 * (n - 2);
            if (sumOfAngles == expectedSum) {
                System.out.println("Багатокутник може існувати.");
            } else {
                System.out.println("Багатокутник не може існувати.");
            }
            System.out.println("Сума кутів: " + sumOfAngles);
            System.out.println("Очікувана сума кутів: " + expectedSum);
        }
    }
}