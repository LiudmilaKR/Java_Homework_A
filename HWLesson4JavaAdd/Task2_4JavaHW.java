package HomeworksAdd.HWJavaAdd.HWLesson4JavaAdd;

import java.util.LinkedList;

public class Task2_4JavaHW {
//     Реализуйте очередь с помощью LinkedList со следующими методами:
//      • enqueue() — помещает элемент в конец очереди,
//      • dequeue() — возвращает первый элемент из очереди и удаляет его,
//      • first() — возвращает первый элемент из очереди, не удаляя.
    public static void main(String[] args) {
        Que que = new Que();
        System.out.println(que);
        que.enqueue(11);
        que.enqueue(45);
        que.enqueue(7811);
        que.enqueue(0115676);
        que.enqueue(56711);
        System.out.println(que);
        System.out.println("Первый элемент в очереди это " + que.dequeue() + ", удаляем его.");
        System.out.println(que);
        System.out.println("Первый элемент в очереди это " + que.first() + ", не удаляем его.");
        System.out.println(que);
    }

}

class Que {
    
    private LinkedList<Integer> ll = new LinkedList<>();
    
    void enqueue(Integer el) {
        ll.addLast(el);
    }
    
    int dequeue() {
        if (ll.isEmpty()) return 0;
        else return ll.pop();
    }
    
    int first() {
        if (ll.isEmpty()) return 0;
        else return ll.peek();
    }
    
    @Override
    public String toString() {
        return "Que " + ll;
    }
}
