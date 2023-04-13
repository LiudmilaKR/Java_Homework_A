package HomeworksAdd.HWJavaAdd.HWLesson1JavaAdd;

public class Task3_1JavaHW {
    // Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
    public static void main(String[] args) {
        System.out.printf("%d", 2);
        int i = 3;
        ONE: while (i < 1000) {
            for (int j = 3; j < i; j++) {
                if (i % j == 0) {
                    i += 2;
                    continue ONE;
                }  
            }
            System.out.printf(" %d", i);
            i += 2;
        }
    }
}
