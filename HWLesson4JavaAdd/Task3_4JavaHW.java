package HomeworksAdd.HWJavaAdd.HWLesson4JavaAdd;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Task3_4JavaHW {
    // Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
    public static void main(String[] args) {
        LinkedList<Integer> llist = Task1_4JavaHW.fillLinkedList(5);
        System.out.println(llist);
        System.out.println(var1(llist));
        System.out.println(var2(llist));
        System.out.println(var3(llist));
    }
    
    static int var1(LinkedList<Integer> ll) {
        int sum = 0;
        for (Integer item : ll) {
            sum += item;
        }
        return sum;
    }

    static int var2(LinkedList<Integer> ll) {
        int sum = 0;
        Iterator<Integer> iter = ll.iterator();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        return sum;
    }

    static int var3(LinkedList<Integer> ll) {
        int sum = 0;
        ListIterator<Integer> iter = ll.listIterator();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        return sum;
    }
}
