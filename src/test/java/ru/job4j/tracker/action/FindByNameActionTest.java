package ru.job4j.tracker.action;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Store;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.Stub;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

class FindByNameActionTest {
    @Test
    public void whenItemsFoundByName() {
        Output output = new Stub();
        Store tracker = mock(Store.class);
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        List<Item> items = Arrays.asList(item1, item2);
        FindByNameAction findByNameAction = new FindByNameAction(output);
        Input input = mock(Input.class);
        when(input.askStr(anyString())).thenReturn("item");
        when(tracker.findByName("item")).thenReturn(items);

        findByNameAction.execute(input, tracker);

        String ln = System.lineSeparator();
        String expected = "=== Вывод заявок по имени ===" + ln
                + item1 + ln
                + item2 + ln;
        assertEquals(expected, output.toString());
    }
}