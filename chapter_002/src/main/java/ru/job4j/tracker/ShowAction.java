package ru.job4j.tracker;

import java.util.Date;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            Date date = new Date(item.getTime());
            System.out.println("Item with name " + item.getName() + ", id " + item.getId() + ", created " + date + "\n" + item.getDesc());
        }
        return true;
    }
}
