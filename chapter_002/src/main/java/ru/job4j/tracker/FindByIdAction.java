package ru.job4j.tracker;

import java.util.Date;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item with id " + id + " does not exist");
        } else {
            Date date = new Date(item.getTime());
            System.out.println("Item with id " + item.getId() + ", created " + date + "\n" + item.getDesc());
        }
        return true;
    }
}
