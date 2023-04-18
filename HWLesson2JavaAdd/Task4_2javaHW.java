package HomeworksAdd.HWJavaAdd.HWLesson2JavaAdd;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4_2javaHW {
    // *Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
    // Сортировка пузырьком — один из самых известных алгоритмов сортировки.
    // Здесь нужно последовательно сравнивать значения соседних элементов и менять числа местами,
    // если предыдущее оказывается больше последующего.
    // Таким образом элементы с большими значениями оказываются в конце списка, а с меньшими остаются в начале.

    public static void main(String[] args) throws SecurityException, IOException {
    
        Logger loging = Logger.getLogger(Task4_2javaHW.class.getName());
        FileHandler fh = new FileHandler("HomeworksAdd/HWJavaAdd/HWLesson2JavaAdd/Log4_2.txt", false);
        loging.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        int[] array = getArray(11);
        loging.log(Level.INFO, "Первоначальный массив => " + Arrays.toString(array));
        
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            loging.log(Level.INFO, "Результат " + (i + 1) + "-ого прохода по массиву => " + Arrays.toString(array));
        }
        loging.log(Level.INFO, "Отсортитрованный массив => " + Arrays.toString(array));
        fh.close();
    }
    
    static int[] getArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(1, 100);  
        }
        return arr;
    }  
}
