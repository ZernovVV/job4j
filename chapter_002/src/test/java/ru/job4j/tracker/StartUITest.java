package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC", "Just fix that old PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC", "Just fix that old PC", 123L);
        assertThat(created.getName(), is(expected.getName()));
        assertThat(created.getDesc(), is(expected.getDesc()));
    }

    @Test
    public void whenReplaceItem() {
        String[] answers = {"Fix PC", "Just fix that old PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        String[] replaceAnswers = {tracker.findAll()[0].getId(), "Fix same PC", "Fix that old PC again"};
        Input replaceInput = new StubInput(replaceAnswers);
        StartUI.replaceItem(replaceInput, tracker);
        Item expected = tracker.findAll()[0];
        assertThat(expected.getName(), is("Fix same PC"));
        assertThat(expected.getDesc(), is("Fix that old PC again"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        String[] answers = {"Fix PC", "Just fix that old PC"};
        Input input = new StubInput(answers);
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        String[] deleteAnswers = {created.getId()};
        Input deleteItem = new StubInput(deleteAnswers);
        StartUI.deleteItem(deleteItem, tracker);
        assertNull(tracker.findById(created.getId()));
    }
}
