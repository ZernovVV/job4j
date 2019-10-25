package ru.job4j.tracker;

import java.util.Date;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Enter item name: ");
        Item[] items = tracker.findByName(key);
        for (Item item : items) {
            Date date = new Date(item.getTime());
            System.out.println("Item with id " + item.getId() + ", created " + date + "\n" + item.getDesc());
        }
        return true;
    }
}
