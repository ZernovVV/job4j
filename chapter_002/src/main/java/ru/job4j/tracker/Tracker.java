package ru.job4j.tracker;

import java.util.*;
/**
 * @author vzernov
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище.
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Метод заменяет заявку в хранилище
     * @param id уникальный ключ для заявки.
     * @param item новая заявка.
     * @return boolean результат - удалось ли провести операцию.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                this.items[index] = item;
                this.items[index].setId(id);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаляет заявку в хранилище
     * @param id уникальный ключ для заявки.
     * @return boolean результат - удалось ли провести операцию.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                System.arraycopy(items, index + 1, items, index, items.length - index - 1);
                this.position--;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает существующие заявки.
     * @return массив существующих заявок.
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, this.position);
    }

    /**
     * Метод возвращает заявки с заданным именем.
     * @param key искомое значение поля name.
     * @return массив заявок.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int count = 0;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[count] = this.items[index];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Метод возвращает заявку с заданным уникальным ключем.
     * @param id уникальный ключ для заявки.
     * @return возвращает заявку, если заявка не найдена - возвращает null.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

}