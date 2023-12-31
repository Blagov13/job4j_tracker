package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = j -> j.getName().contains(key);
        Predicate<Person> surname = j -> j.getSurname().contains(key);
        Predicate<Person> address = j -> j.getAddress().contains(key);
        Predicate<Person> phone = j -> j.getPhone().contains(key);
        var combine = name.or(surname).or(address).or(phone);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
