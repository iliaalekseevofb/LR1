package arraySum;
import java.util.Scanner;

public class arraySum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] intArr = new int[5];
    int intSumFor = 0;
    int intSumWhile = 0;
    int intSumDoWhile = 0;

    // Ввод чисел списка
    for (int i = 0; i < intArr.length; i++) {
      if (scanner.hasNextInt()) {
        intArr[i] = scanner.nextInt();
      } else {
        System.out.println("Вы ввели не целое число");
        break;
      }
    }

    // Рассчет суммы чисел списка с помощью цикла for
    for (int j : intArr) {
      intSumFor += j;
    }

    // Рассчет суммы чисел списка с помощью while
    int countWhile = 0;
    while (countWhile < intArr.length) {
      intSumWhile += intArr[countWhile];
      countWhile += 1;
    }

    // Рассчет суммы чисел с помощью do while
    int countDoWhile = 0;
    do {
      intSumDoWhile += intArr[countDoWhile];
      countDoWhile += 1;
    } while (countDoWhile < intArr.length);

    // Вывод суммы чисел в консоль
    System.out.println("Сумма чисел через for: " + intSumFor);
    System.out.println("Сумма чисел через while: " + intSumWhile);
    System.out.println("Сумма чисел через do while: " + intSumDoWhile);
  }
}
