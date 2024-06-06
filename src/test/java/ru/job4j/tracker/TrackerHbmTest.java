package ru.job4j.tracker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TrackerHbmTest {
    private HbmTracker tracker;

    @BeforeEach
    public void setUp() {
        tracker = new HbmTracker();
    }

    @AfterEach
    public void tearDown() {
        tracker.close();
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Item item = new Item("test1");
        Item added = tracker.add(item);
        Item result = tracker.findById(added.getId());
        assertThat(result).isEqualTo(added);
    }

    @Test
    public void whenReplaceItemThenReturnTrue() {
        Item item = new Item("test1");
        Item added = tracker.add(item);
        boolean replaced = tracker.replace(added.getId(), new Item("new name"));
        assertThat(replaced).isTrue();
        Item result = tracker.findById(added.getId());
        assertThat(result.getName()).isEqualTo("new name");
    }

    @Test
    public void whenDeleteItemThenTrackerDoesNotHaveSameItem() {
        Item item = new Item("test1");
        Item added = tracker.add(item);
        tracker.delete(added.getId());
        Item result = tracker.findById(added.getId());
        assertThat(result).isNull();
    }

    @Test
    public void whenFindAllThenReturnAllItems() {
        tracker.add(new Item("item1"));
        tracker.add(new Item("item2"));
        tracker.add(new Item("item3"));
        List<Item> items = tracker.findAll();
        assertThat(items).hasSize(3);
    }

    @Test
    public void whenFindByNameThenReturnItemsWithSameName() {
        tracker.add(new Item("item1"));
        tracker.add(new Item("item2"));
        tracker.add(new Item("item3"));
        List<Item> items = tracker.findByName("item2");
        assertThat(items).hasSize(1);
        assertThat(items.get(0).getName()).isEqualTo("item2");
    }

    @Test
    public void whenFindByIdThenReturnCorrectItem() {
        Item item = new Item("test1");
        Item added = tracker.add(item);
        Item result = tracker.findById(added.getId());
        assertThat(result).isEqualTo(added);
    }
}
