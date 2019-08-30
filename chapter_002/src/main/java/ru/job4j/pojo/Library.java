package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book alphbt = new Book("Alphabet", 40);
        Book enc = new Book("Encyclopedia", 1000);
        Book poetry = new Book("Poetry of the Lorka", 300);
        Book code = new Book("Clean code", 464);

        Book[] shelve = new Book[4];

        shelve[0] = alphbt;
        shelve[1] = enc;
        shelve[2] = poetry;
        shelve[3] = code;

        for (int index = 0; index < shelve.length; index++) {
            Book book = shelve[index];
            System.out.println("page count in " + book.getTitle() + " : " + book.getPageCount());
        }

        System.out.println("\nLet's read some books and put them back on shelve\n");
        Book temp = shelve[0];
        shelve[0] = shelve[3];
        shelve[3] = temp;

        System.out.println("Now the order of books is :");
        for (int index = 0; index < shelve.length; index++) {
            Book book = shelve[index];
            System.out.println("page count in " + book.getTitle() + " : " + book.getPageCount());
        }

        System.out.println("\nShown only \"Clean code\"");
        for (int index = 0; index < shelve.length; index++) {
            Book book = shelve[index];
            if (book.getTitle().equals("Clean code")) {
                System.out.println(book.getTitle() + " - " + book.getPageCount());
            }
        }

    }
}
