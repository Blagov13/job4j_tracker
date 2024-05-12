package ru.job4j.tracker.action;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.SqlTracker;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.Stub;

import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class DeleteActionTest {
    @Test
    public void whenItemDeleted() {
        Output output = new Stub();
        SqlTracker tracker = new SqlTracker();
        Item item = tracker.add(new Item("item"));
        DeleteAction deleteAction = new DeleteAction(output);
        Input input = mock(Input.class);
        when(input.askInt(any(String.class))).thenReturn(item.getId());
        deleteAction.execute(input, tracker);
        String ln = System.lineSeparator();
        String expected = "=== Удаление заявки ===" + ln + "Заявка удалена успешно." + ln;
        String actualOutput = output.toString();
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actualOutput);
        assertEquals(expected, output.toString());
    }
}