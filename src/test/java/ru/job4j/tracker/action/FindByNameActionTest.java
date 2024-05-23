package ru.job4j.tracker.action;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.SqlTracker;
import ru.job4j.tracker.Store;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.Stub;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

class FindByNameActionTest {
    @Test
    public void whenItemsFoundByName() {
        Output output = new Stub();
        Store tracker = new SqlTracker();
        Item item1 = tracker.add(new Item(1, "test", LocalDateTime.now()));
        Input input = mock(Input.class);
        FindByNameAction findByNameAction = new FindByNameAction(output);
        when(input.askStr(any(String.class))).thenReturn(item1.getName());
        findByNameAction.execute(input, tracker);
        String ln = System.lineSeparator();
        String expected = "=== Вывод заявок по имени ===" + ln
                + item1 + ln;
        assertEquals(expected, output.toString());
    }
}