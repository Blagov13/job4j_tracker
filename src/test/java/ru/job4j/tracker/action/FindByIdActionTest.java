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
import static org.mockito.ArgumentMatchers.anyString;

class FindByIdActionTest {
    @Test
    public void whenItemFoundById() {
        Output output = new Stub();
        Store tracker = new SqlTracker();
        Item item = tracker.add(new Item(1, "Test", LocalDateTime.now()));
        Input input = mock(Input.class);
        FindByIdAction findByIdAction = new FindByIdAction(output);
        when(input.askInt(any(String.class))).thenReturn(item.getId());
        findByIdAction.execute(input, tracker);
        String ln = System.lineSeparator();
        String expected = "=== Вывод заявки по id ===" + ln + item + ln;
        assertEquals(expected, output.toString());
    }
}