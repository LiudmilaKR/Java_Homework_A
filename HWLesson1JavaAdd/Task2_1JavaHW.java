package HomeworksAdd.HWJavaAdd.HWLesson1JavaAdd;

import java.util.Scanner;

public class Task2_1JavaHW {
    // Вычислить n! (произведение чисел от 1 до n)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число n => ");
        int n = scan.nextInt();
        double res = 1;
        if (n == 0 || n == 1) res = 1;
        else {
            for (int i = 2; i < n + 1; i++) {
                res *= i;
            }
        }
        System.out.printf("Факториал числа %d равен %.0f", n, res);
        scan.close();
    }
}