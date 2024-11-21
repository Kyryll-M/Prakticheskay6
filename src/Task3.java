import java.util.Scanner;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nВведіть значення, яке потрібно знайти: ");
        int valueToFind = scanner.nextInt();

        System.out.print("Введіть значення, на яке потрібно замінити: ");
        int valueToReplace = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] == valueToFind) {
                array[i] = valueToReplace;
            }
        }

        System.out.println("Масив після заміни:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

