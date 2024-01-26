package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.item.AscByName;
import ru.job4j.tracker.item.DescByName;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemSorterTest {
    @Test
    public void whenSortAscByName() {
        List<Item> items = Arrays.asList(
                new Item("Phone"),
                new Item("Book"),
                new Item("Milk"),
                new Item("Alphabet")
        );
        List<Item> expected = Arrays.asList(
                new Item("Alphabet"),
                new Item("Book"),
                new Item("Milk"),
                new Item("Phone")
        );
        items.sort(new AscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenSortDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Phone"),
                new Item("Book"),
                new Item("Milk"),
                new Item("Alphabet")
        );
        List<Item> expected = Arrays.asList(
                new Item("Phone"),
                new Item("Milk"),
                new Item("Book"),
                new Item("Alphabet")
        );
        items.sort(new DescByName());
        assertThat(items).isEqualTo(expected);
    }
}
