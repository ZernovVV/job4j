package ru.job4j.tracker;

import java.util.Date;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr(""));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = input.askStr("");
                System.out.print("Enter description: ");
                String desc = input.askStr("");
                long time = System.currentTimeMillis();
                Item item = new Item(name, desc, time);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    Date date = new Date(item.getTime());
                    System.out.println("Item with name " + item.getName() + ", id " + item.getId() + ", created " + date + "\n" + item.getDesc());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.print("Enter id: ");
                String id = input.askStr("");
                System.out.print("Enter name: ");
                String name = input.askStr("");
                System.out.print("Enter description: ");
                String desc = input.askStr("");
                long time = System.currentTimeMillis();
                Item item = new Item(name, desc, time);
                if (tracker.replace(id, item)) {
                    System.out.println("Editing item id " + id + " successfully");
                } else {
                    System.out.println("Edit item failed");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print("Enter id: ");
                String id = input.askStr("");
                if (tracker.delete(id)) {
                    System.out.println("Deletion item id " + id + " successfully");
                } else {
                    System.out.println("Deletion failed");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.print("Enter id: ");
                String id = input.askStr("");
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item with id " + id + " does not exist");
                } else {
                    Date date = new Date(item.getTime());
                    System.out.println("Item with id " + item.getId() + ", created " + date + "\n" + item.getDesc());
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.print("Enter item name: ");
                String key = input.askStr("");
                Item[] items = tracker.findByName(key);
                for (Item item : items) {
                    Date date = new Date(item.getTime());
                    System.out.println("Item with id " + item.getId() + ", created " + date + "\n" + item.getDesc());
                }
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
