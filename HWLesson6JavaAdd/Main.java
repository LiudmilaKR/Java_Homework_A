package HomeworksAdd.HWJavaAdd.HWLesson6JavaAdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(16, 128, "Linux", "black"));
        notebooks.add(new Notebook(8, 64, "Windows", "silver"));
        notebooks.add(new Notebook(16, 64, "Linux", "black"));
        notebooks.add(new Notebook(16, 128, "Linux", "black"));
        notebooks.add(new Notebook(8, 128, "Windows", "silver"));
        notebooks.add(new Notebook(16, 128, "Windows", "silver"));
        notebooks.add(new Notebook(16, 64, "Windows", "black"));
        notebooks.add(new Notebook(8, 64, "Linux", "black"));
        notebooks.add(new Notebook(16, 128, "Linux", "silver"));
        notebooks.add(new Notebook(8, 64, "Windows", "black"));
        notebooks.add(new Notebook(16, 128, "Windows", "black"));
        // System.out.println(notebooks);
        Set<Integer> omset = new HashSet<>();
        Set<Integer> hdset = new HashSet<>();
        Set<String> osset = new HashSet<>();
        Set<String> colset = new HashSet<>();
        
        for (Notebook item : notebooks) {
            omset.add(item.getOperMem());
            hdset.add(item.getHd());
            osset.add(item.getOperSystem());
            colset.add(item.getColor());
        }

        Map<String, String> res = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        String[] keys = new String[] {"ОЗУ", "Объем ЖД", "ОС", "Цвет"};
        while (choice != 7) {
            System.out.println("   Выберите критерий:\n" + "\t1 - ОЗУ\n" + "\t2 - Объем ЖД\n" + "\t3 - Операционная система\n" +
                "\t4 - Цвет\n" + "\t5 - Список выбранных вариантов\n" + "\t6 - Список ноутов в магазине\n" + "\t7 - Выход");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Выберите объем ОЗУ из списка => " + omset);
                    res.put(keys[0], Integer.toString(scan.nextInt()));
                    break;
                case 2:
                    System.out.println("Выберите объем ЖД из списка => " + hdset);
                    res.put(keys[1], Integer.toString(scan.nextInt()));
                    break;
                case 3:
                    System.out.println("Выберите операционную систему из списка => " + osset);
                    res.put(keys[2], scan.next());
                    break;
                case 4:
                    System.out.println("Выберите цвет из списка => " + colset);
                    res.put(keys[3], scan.next());
                    break;
                case 5:
                    printResList(res, notebooks, keys);
                    break;
                case 6:
                    printAllNotbooks(notebooks);
                    break;
                default:
                    if (choice == 7) System.out.println("Завршение работы! До свидания!");
                    else System.out.println("Ввод некорректен! Попробуйте ещё раз!");
                    break;
            }
        }
        scan.close();
    }

    static void printResList(Map<String, String> map, List<Notebook> notes, String[] k) {
        List<Notebook> notesRes = new ArrayList<>();
        if (map.isEmpty()) {
            notesRes = notes;
        }
        else {
            for (Notebook item : notes) {
                boolean flag = true;
                for (Map.Entry<String, String> ent : map.entrySet()) {
                    if(ent.getKey().equals(k[0])) {
                        // {"ОЗУ", "Объем ЖД", "ОС", "Цвет"}
                        if (!String.valueOf(item.getOperMem()).equals(ent.getValue())) {
                            flag = false;
                        }
                    } else {
                        if(ent.getKey().equals(k[1])) {
                            if (!String.valueOf(item.getHd()).equals(ent.getValue())) {
                                flag = false;
                            }
                        } else {
                            if(ent.getKey().equals(k[2])) {
                                if (!item.getOperSystem().equals(ent.getValue())) {
                                    flag = false;
                                }
                            } else {
                                if(ent.getKey().equals(k[3])) {
                                    if (!item.getColor().equals(ent.getValue())) {
                                        flag = false;
                                    }
                                }
                            }
                        }
                    }
                }
                if (flag) {
                    notesRes.add(item);
                }
            }
            printAllNotbooks(notesRes);
        }

    }

    static void printAllNotbooks(List<Notebook> notes) {
        System.out.println("Список ноутбуков в наличии:");
        for (Notebook item : notes) {
            System.out.print(item);
        }

    }
}
