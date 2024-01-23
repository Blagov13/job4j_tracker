package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;

import java.util.Comparator;

public class DescByName implements Comparator<Item> {
    @Override
    public int compare(Item left, Item right) {
        return right.getName().compareTo(left.getName());
    }
}
