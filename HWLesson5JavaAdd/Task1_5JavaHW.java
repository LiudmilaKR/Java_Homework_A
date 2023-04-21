package HomeworksAdd.HWJavaAdd.HWLesson5JavaAdd;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

public class Task1_5JavaHW {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    public static void main(String[] args) {

        // Вариант 1 (без класса)
        // Map<String, List<String>> phoneBook = new HashMap<>();
        // List<String> ip = new ArrayList<>();
        // ip.add("2319805437786");
        // ip.add("2345340543786");
        // phoneBook.put("ИванПетров", ip);

        // List<String> sk = new ArrayList<>();
        // sk.add("223456343456");
        // phoneBook.put("СергейКоролев", sk);

        // System.out.println(phoneBook);
        PhoneBook phb = new PhoneBook();
        phb.addName("Сергей Иванов");
        phb.addName("Виталий Петров");
        phb.addPhone("23234243235", "Сергей Иванов");
        phb.addPhone("23234246752", "Сергей Иванов");
        phb.addPhone("18387724323", "Сергей Иванов");
        phb.addPhone("12284376323", "Виталий Петров");
        System.out.println(phb);
        
    }
}
