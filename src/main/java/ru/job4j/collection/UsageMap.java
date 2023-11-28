package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("blagov13rus@gmail.com", "Blagov Aleksandr Alekseevich");
        map.put("blagova13@Gmail.com", "Blagova Daria Sergeevna");
        map.put("blagov13rus@gmail.com", "Blagov Barni Aleksandrovich");
        map.put("Student@Gmail.com", "Novikov Aleksandr Alekseeevich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
