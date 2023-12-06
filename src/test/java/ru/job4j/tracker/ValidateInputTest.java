package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.Mock;
import ru.job4j.tracker.input.Validate;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.Stub;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {
    @Test
    void whenInvalidInput() {
        Output out = new Stub();
        Input in = new Mock(
                new String[] {"one", "1"}
        );
        Validate input = new Validate(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenCorrectInput() {
        Output out = new Stub();
        Input in = new Mock(
                new String[] {"1"}
        );
        Validate input = new Validate(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenMultipleCorrectInput() {
        Output out = new Stub();
        Input in = new Mock(
                new String[] {"1", "2", "3"}
        );
        Validate input = new Validate(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
        int selected1 = input.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(2);
        int selected2 = input.askInt("Enter menu:");
        assertThat(selected2).isEqualTo(3);
    }

    @Test
    void whenEnteringANegativeNumber() {
        Output out = new Stub();
        Input in = new Mock(
                new String[] {"-1"}
        );
        Validate input = new Validate(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}
