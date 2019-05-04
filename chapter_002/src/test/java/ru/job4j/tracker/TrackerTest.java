package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author vzernov
 * @version $Id$
 * @since 0.1
 */
public class TrackerTest {
    /**
     * Добавление заявки.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Замена заявки.
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Удаление заявки.
     */
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        Item item2 = new Item("test2", "testDescription2", 1234L);
        tracker.add(item2);
        Item item3 = new Item("test3", "testDescription3", 12345L);
        tracker.add(item3);
        tracker.delete(item.getId());
        assertThat(tracker.findAll().length, is(2));
    }

    /**
     * Поиск существующих заявок.
     */
    @Test
    public void whenFindAllItemsThanReturnAllItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        Item item2 = new Item("test2", "testDescription2", 1234L);
        tracker.add(item2);
        Item item3 = new Item("test3", "testDescription3", 12345L);
        tracker.add(item3);
        assertThat(tracker.findAll().length, is(3));
    }

    /**
     * Поиск заявок с заданным полем name.
     */
    @Test
    public void whenFindByNameThanReturnTwoItemsWithRequiredName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test", "testDescription", 123L);
        tracker.add(item);
        Item item2 = new Item("test2", "testDescription2", 1234L);
        tracker.add(item2);
        Item item3 = new Item("test", "testDescription3", 12345L);
        tracker.add(item3);
        Item[] expected = new Item[2];
        expected[0] = tracker.findById(item.getId());
        expected[1] = tracker.findById(item3.getId());
        assertThat(tracker.findByName("test"), is(expected));
    }

    /**
     * Поиск заявки по уникальному ключу.
     */
    @Test
    public void whenFindByIdThanItemWithRequiredId() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        String id = item.getId();
        assertThat(tracker.findById(id), is(item));
    }
}