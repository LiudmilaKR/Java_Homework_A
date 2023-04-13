package HomeworksAdd.HWJavaAdd.HWLesson1JavaAdd;

import java.util.Scanner;

public class Task5_1JavaHW {
    // * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
    // например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно 
    // решение или сообщить, что его нет.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите q => ");
        String q = scan.nextLine();
        System.out.print("Введите w => ");
        String w = scan.next();
        System.out.print("Введите сумму выражения => ");
        int total = scan.nextInt();
        System.out.printf("%s + %S = %d", q, w, total);
        System.out.println();
        String quest = "?";
        int q0 = 0;
        int q1 = 0;
        int w0 = 0;
        int w1 = 0;
        int num = 1;
        int num1 = 0;
        int ind_questq = q.indexOf(quest);
        int ind_questw = w.indexOf(quest);
        if ((ind_questq == 0) & (ind_questw) == 0) {
            q1 = Integer.parseInt("" + q.charAt(1));
            w1 = Integer.parseInt("" + w.charAt(1));
            num = total - q1 - w1;
            if (num % 10 == 0) {
                num = num / 10;
                num1 = (int)(Math.random() * num);
                System.out.printf("%d + %d = %d", num1 * 10 + q1, (num - num1) * 10 + w1, total);
                System.out.println();
            }
            else System.out.println("Решения нет!");
        }
        if ((ind_questq == 0) & (ind_questw) == 1) {
            q1 = Integer.parseInt("" + q.charAt(1));
            w0 = Integer.parseInt("" + w.charAt(0));
            num = total - q1 - w0 * 10;
            if (num > 0) {
                System.out.printf("%d + %d = %d", num - (num % 10) + q1, w0 * 10 + (num % 10), total);
                System.out.println();
            }
            else System.out.println("Решения нет!");
        }
        if ((ind_questq == 1) & (ind_questw) == 0) {
            q0 = Integer.parseInt("" + q.charAt(0));
            w1 = Integer.parseInt("" + w.charAt(1));
            num = total - q0 * 10 - w1;
            if (num > 0) {
                System.out.printf("%d + %d = %d", q0 * 10 + (num % 10), num - (num % 10) + w1,  total);
                System.out.println();
            }
            else System.out.println("Решения нет!");
        }
        if ((ind_questq == 1) & (ind_questw) == 1) {
            q0 = Integer.parseInt("" + q.charAt(0));
            w0 = Integer.parseInt("" + w.charAt(0));
            num = total - (q0 + w0) * 10;
            if (num > 0 & num < 18) {
            num1 = (int)(Math.random() * num);
            System.out.printf("%d + %d = %d", q0 * 10 + num1, w0 * 10 + (num - num1), total);
            System.out.println();
            }
            else System.out.println("Решения нет!");
        }
        scan.close();
    }
}
