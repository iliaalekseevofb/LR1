package arraySum;
import java.util.Scanner;

public class arraySum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите длину массива: ");
    int arrSize = scanner.nextInt();
    int[] intArr = new int[arrSize];

    // Ввод чисел списка
    System.out.println("Введите элементы массива:");
    for (int i = 0; i < intArr.length; i++) {
      if (scanner.hasNextInt()) {
        intArr[i] = scanner.nextInt();
      } else {
        System.out.println("Вы ввели не целое число");
        break;
      }
    }

    // Рассчет суммы чисел списка с помощью цикла for и вывод суммы чисел в консоль
    int intSumFor = 0;
    for (int j : intArr) {
      intSumFor += j;
    }
    System.out.println("Сумма чисел через for: " + intSumFor);

    // Рассчет суммы чисел списка с помощью while и вывод суммы чисел в консоль
    int intSumWhile = 0;
    int countWhile = 0;
    while (countWhile < intArr.length) {
      intSumWhile += intArr[countWhile];
      countWhile += 1;
    }
    System.out.println("Сумма чисел через while: " + intSumWhile);

      // Рассчет суммы чисел с помощью do while и вывод суммы чисел в консоль
      int intSumDoWhile = 0;
      int countDoWhile = 0;
      do {
        intSumDoWhile += intArr[countDoWhile];
        countDoWhile += 1;
      } while (countDoWhile < intArr.length);
      System.out.println("Сумма чисел через do while: " + intSumDoWhile);
  }
}
