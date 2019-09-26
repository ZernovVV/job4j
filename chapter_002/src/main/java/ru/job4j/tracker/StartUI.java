package ru.job4j.tracker;

import java.util.Date;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        String desc = input.askStr("Enter description: ");
        long time = System.currentTimeMillis();
        Item item = new Item(name, desc, time);
        tracker.add(item);
    }
    public static void showItems(Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            Date date = new Date(item.getTime());
            System.out.println("Item with name " + item.getName() + ", id " + item.getId() + ", created " + date + "\n" + item.getDesc());
        }
    }
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
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
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Deletion item id " + id + " successfully");
        } else {
            System.out.println("Deletion failed");
        }
    }
    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item with id " + id + " does not exist");
        } else {
            Date date = new Date(item.getTime());
            System.out.println("Item with id " + item.getId() + ", created " + date + "\n" + item.getDesc());
        }
    }
    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String key = input.askStr("Enter item name: ");
        Item[] items = tracker.findByName(key);
        for (Item item : items) {
            Date date = new Date(item.getTime());
            System.out.println("Item with id " + item.getId() + ", created " + date + "\n" + item.getDesc());
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItems(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
               StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findByNameItem(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.\n"
        + "0. Add new Item\n"
        + "1. Show all items\n"
        + "2. Edit item\n"
        + "3. Delete item\n"
        + "4. Find item by Id\n"
        + "5. Find items by name\n"
        + "6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
