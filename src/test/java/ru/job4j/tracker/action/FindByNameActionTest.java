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

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FindByNameActionTest {
    @Test
    public void whenItemsFoundByName() {
        LocalDateTime fixedDateTime = LocalDateTime.of(2022, 1, 1, 12, 0);
        Output output = new Stub();
        Store tracker = new SqlTracker();
        Item item = tracker.add(new Item(1, "test3", fixedDateTime));
        Input input = mock(Input.class);
        FindByNameAction findByNameAction = new FindByNameAction(output);
        when(input.askStr(any(String.class))).thenReturn(item.getName());
        findByNameAction.execute(input, tracker);
        String ln = System.lineSeparator();
        String expected = "=== Вывод заявок по имени ===" + ln
                + item + ln;
        assertEquals(expected, output.toString());
        tracker.delete(item.getId());
    }
}