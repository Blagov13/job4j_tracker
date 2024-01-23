package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Удаление заявки ===");
        int id = input.askInt("Enter id: ");
        Item item = memTracker.findById(id);
        memTracker.delete(id);
        out.println(item != null ? "Заявка удалена успешно."
                : "Ошибка удаления заявки.");
        return true;
    }
}
