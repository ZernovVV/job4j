package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        String desc = input.askStr("Enter description: ");
        long time = System.currentTimeMillis();
        Item item = new Item(name, desc, time);
        if (tracker.replace(id, item)) {
            System.out.println("Editing item id " + id + " successfully");
        } else {
            System.out.println("Edit item failed");
        }
        return true;
    }
}
