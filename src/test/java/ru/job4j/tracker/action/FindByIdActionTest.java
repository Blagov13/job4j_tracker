package ru.job4j.tracker.action;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Store;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.Stub;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

class FindByIdActionTest {
    @Test
    public void whenItemFoundById() {
        Output output = new Stub();
        Store tracker = mock(Store.class);
        Item item = new Item("item");
        item.setId(1);
        FindByIdAction findByIdAction = new FindByIdAction(output);
        Input input = mock(Input.class);
        when(input.askInt(anyString())).thenReturn(1);
        when(tracker.findById(1)).thenReturn(item);

        findByIdAction.execute(input, tracker);

        String ln = System.lineSeparator();
        String expected = "=== Вывод заявки по id ===" + ln + item + ln;
        assertEquals(expected, output.toString());
    }
}