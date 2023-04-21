package HomeworksAdd.HWJavaAdd.HWLesson5JavaAdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task2_5JavaHW {
    // Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, 
    // Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария 
    // Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
    public static void main(String[] args) {
        String ss = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков," + 
            " Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова," + 
            " Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] arr = ss.split(", ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        Map<String, Integer> hMap = new HashMap<>();
        for (String item : arr) {
            String name = item.split(" ")[0];
            if (hMap.containsKey(name)) hMap.put(name, hMap.get(name) + 1); 
            else hMap.put(name, 1);
        }
        System.out.println(hMap);
        System.out.println();
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Integer> item : hMap.entrySet()) {
            if (map.containsKey(item.getValue())) {
                List<String> list1 = map.get(item.getValue());
                list1.add(item.getKey());
            } else {
                List<String> list2 = new ArrayList<>();
                list2.add(item.getKey());
                map.put(item.getValue(), list2);
            }
        }
        System.out.println(map);
    }
}
