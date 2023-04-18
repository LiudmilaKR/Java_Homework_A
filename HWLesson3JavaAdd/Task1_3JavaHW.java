package HomeworksAdd.HWJavaAdd.HWLesson3JavaAdd;

import java.util.ArrayList;
import java.util.List;

public class Task1_3JavaHW {
    // Пусть дан произвольный список целых чисел, удалить из него четные числа
    public static void main(String[] args) {
        List<Integer> list = fillArrayList(15);
        System.out.println(list);
        delEven(list);
        System.out.println(list);
        
    }

    static List<Integer> fillArrayList(int n) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrList.add((int) (Math.random() * 30) + 1);
        }
        return arrList;
    }

    static void delEven(List<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
                i--;
            }
        }
    }
}
