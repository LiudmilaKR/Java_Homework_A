package HomeworksAdd.HWJavaAdd.HWLesson1JavaAdd;

import java.util.Scanner;

public class Task1_1JavaHW {
    // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число n => ");
        int n = scan.nextInt();
        System.out.printf("n-ое треугольное число равно %d", (int) (0.5 * n * (n + 1)));
        scan.close();
    }
}
