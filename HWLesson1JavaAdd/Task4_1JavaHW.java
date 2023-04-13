package HomeworksAdd.HWJavaAdd.HWLesson1JavaAdd;
// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

import java.util.Scanner;

public class Task4_1JavaHW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число => ");
        int a = scan.nextInt();
        System.out.print("Введите второе число => ");
        int b = scan.nextInt();
        System.out.print("Введите операцию (+ - * /) => ");
        scan.nextLine();
        String operation = scan.nextLine();
        culc(a, b, operation);
        scan.close();
    }

    static void culc(int x, int y, String oper) {
        switch (oper) {
            case("+"):
                System.out.printf("%d %s %d = %d", x, oper, y, x + y);
                break;
            case("-"):
                System.out.printf("%d %s %d = %d", x, oper, y, x - y);
                break;
            case("*"):
                System.out.printf("%d %s %d = %d", x, oper, y, x * y);;
                break;
            case("/"):
                if (y == 0) System.out.println("Деление на ноль!");
                else System.out.printf("%d %s %d = %.2f", x, oper, y, (double)x / (double)y);
                break;
        }
    }
}
