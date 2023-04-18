package HomeworksAdd.HWJavaAdd.HWLesson2JavaAdd;

// Дана json строка { { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}}
// Задача написать метод(ы), который распарсить строку и выдаст ответ вида: Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика. Студент Краснов получил 5 по предмету Физика.
// Используйте StringBuilder для подготовки ответа

// Json строка в задании не совсем json - обрабатывала, что есть... :)

public class Task1_2JavaHW {
    public static void main(String[] args) {
        String ss = "{ { \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}}";
        ss = deleteNeedlessSimbol(ss);
        System.out.println(result(takeArray(ss)));
    }

    static String deleteNeedlessSimbol(String s) {
        s = s.replace("{ {", "");
        s = s.replace("}}", "").trim();
        s = s.replace("\"", "");
        return s;
    }
    static String[] takeArray(String s) {
        String arr[] = s.split("},\\{");
        return arr;
    }
    static String result(String[]arr) {
        StringBuilder sb = new StringBuilder();
        for (String item : arr) {
            item = item.replace("фамилия:", "Студент ");
            item = item.replace(",оценка:", " получил ");
            item = item.replace(",предмет:", " по предмету ");
            sb.append(item).append(".\n");
        }
        return sb.toString();
    }
}
