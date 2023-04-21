package HomeworksAdd.HWJavaAdd.HWLesson5JavaAdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    Map<String, List<String>> phoneBook = new HashMap<>();

    void addName (String name) {
        phoneBook.put(name, null);
    }

    void addPhone (String phone, String name) {
        // System.out.println(phoneBook.get(name));
        if (phoneBook.get(name) == null) {
            List<String> ph2 = new ArrayList<>();
            ph2.add(phone);
            phoneBook.put(name, ph2);
        } else {
            List<String> ph1 = phoneBook.get(name);
            ph1.add(phone);
        }
    }

    @Override
    public String toString() {
        return "PhoneBook " + phoneBook;
    }
}
