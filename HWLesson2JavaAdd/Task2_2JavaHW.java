package HomeworksAdd.HWJavaAdd.HWLesson2JavaAdd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Создать метод, который запишет результат работы в файл Обработайте исключения и запишите ошибки в лог файл

// Задание не очень поняла - связала его с предыдущим.

public class Task2_2JavaHW {

    static Logger logg;
    public static void main(String[] args) {
        logg = Logger.getAnonymousLogger();
        String pathTask = "HomeworksAdd/HWJavaAdd/HWLesson2JavaAdd/Task2_2.json";
        String pathText = "HomeworksAdd/HWJavaAdd/HWLesson2JavaAdd/Text2_2.txt";
        String pathLog = "HomeworksAdd/HWJavaAdd/HWLesson2JavaAdd/Log2_2.txt";
        FileHandler fh;
        try {
            fh = new FileHandler(pathLog, true);
            logg.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
            String ss = readFromFile(pathTask);
            ss = ss.replace(" ", "");
            ss = ss.replace("[{", "");
            ss = ss.replace("}]", "");
            ss = ss.replace("\"", "").trim();
            ss = Task1_2JavaHW.result(Task1_2JavaHW.takeArray(ss));
            writeToFile(pathText, ss);
            fh.close();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String readFromFile(String path) {
        StringBuilder sb = new StringBuilder();
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            try {
                while ((s = br.readLine()) != null) {
                    sb.append(s);
                }
                logg.log(Level.INFO, "Информация считана из файла.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }        
        return sb.toString();
    }
    
    static void writeToFile(String path, String s) {
        try (FileWriter fw = new FileWriter(path, false)) {
            fw.write(s);
            fw.flush();
            logg.log(Level.INFO, "Информация записана в файл.");
        } catch (IOException e) {
            e.printStackTrace();
            logg.log(Level.WARNING, "Ошибка ввода/вывода!");
        }
    }
}
