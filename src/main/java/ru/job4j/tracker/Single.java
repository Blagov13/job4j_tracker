package ru.job4j.tracker;

import java.util.List;

public class Single {
    private MemTracker memTracker = new MemTracker();

    private static Single instance = null;

    private Single() {
    }

    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }

    public Item add(Item item) {
        return memTracker.add(item);
    }

    public List<Item> findByName(String key) {
        return memTracker.findByName(key);
    }

    public List<Item> findAll() {
        return memTracker.findAll();
    }

    public Item findById(int id) {
        return memTracker.findById(id);
    }

    public boolean replace(int id, Item item) {
        return memTracker.replace(id, item);
    }

    public void delete(int id) {
        memTracker.delete(id);
    }
}
