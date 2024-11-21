import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Перевірити масив на зростання (1) чи спадання (2): ");
        int choice = scanner.nextInt();

        boolean sorted = true;
        for (int i = 1; i < size; i++) {
            if (choice == 1 && array[i] < array[i - 1]) {
                sorted = false;
                break;
            } else if (choice == 2 && array[i] > array[i - 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Масив впорядкований.");
        } else {
            System.out.println("Масив не впорядкований.");
        }
    }
}