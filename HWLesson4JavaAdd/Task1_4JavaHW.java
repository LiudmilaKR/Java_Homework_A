package HomeworksAdd.HWJavaAdd.HWLesson4JavaAdd;

import java.util.LinkedList;

public class Task1_4JavaHW {
    // Пусть дан LinkedList с несколькими элементами.
    // Реализуйте метод, который вернёет «перевёрнутый» список.
    public static void main(String[] args) {
        LinkedList<Integer> llist = fillLinkedList(11);
        System.out.println(llist);
        System.out.println(reversLinkedList(llist));
    }

    static LinkedList<Integer> fillLinkedList(int n) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ll.add((int) ((Math.random()) * 100));
        }
        return ll;
    }

    static LinkedList<Integer> reversLinkedList(LinkedList<Integer> ll1) {
        LinkedList<Integer> ll2 = new LinkedList<>();
        for (Integer item : ll1) {
            ll2.addFirst(item);
        }
        return ll2;
    }
}
