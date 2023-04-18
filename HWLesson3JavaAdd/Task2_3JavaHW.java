package HomeworksAdd.HWJavaAdd.HWLesson3JavaAdd;

import java.util.Collections;
import java.util.List;

public class Task2_3JavaHW {
    // Задан целочисленный список ArrayList.
    // Найти минимальное, максимальное и среднее арифметическое из этого списка.
    // Collections.max()
    public static void main(String[] args) {
        List<Integer> list = Task1_3JavaHW.fillArrayList(5);
        System.out.println(list);
        // int minList = Collections.max(list);
        // Collections.
        System.out.println("Минимальное значение элементов списка равно " + Collections.min(list));
        System.out.println("Максимальное значение элементов списка равно " + Collections.max(list));
        System.out.printf("Среднее арифметическое элементов списка равно %.2f", midArifmetic(list));
    }

    static double midArifmetic(List<Integer> list) {
        double middleArifmetic = 0;
        for (int i = 0; i < list.size(); i++) {
            middleArifmetic += 1.0 * list.get(i) / list.size();
        }
        return middleArifmetic;
    }
}
