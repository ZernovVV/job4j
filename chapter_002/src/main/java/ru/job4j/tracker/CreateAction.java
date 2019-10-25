package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "Create a new Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        String desc = input.askStr("Enter description: ");
        long time = System.currentTimeMillis();
        Item item = new Item(name, desc, time);
        tracker.add(item);
        return true;
    }
}

