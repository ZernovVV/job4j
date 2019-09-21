package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игорёк 1, введите своё имя:");
        String name1 = scan.nextLine();
        System.out.println("Игорёк 2, введите своё имя:");
        String name2 = scan.nextLine();
        boolean isCurrentPlayer = false;
        boolean playGame = true;
        int matches = 11;
        while (playGame) {
            System.out.println((isCurrentPlayer ? name2 : name1) + ", сколько берёте спичек? (Можно от 1 до 3)");
            int select = scan.nextInt();
            scan.nextLine();
            if (select > 3 || select <= 0) {
                System.out.println("Можно от 1 до 3 !");
            } else {
                matches = matches - select;
                if (matches <= 0) {
                    playGame = false;
                } else {
                    System.out.println("Осталось " + matches + " спичек");
                    isCurrentPlayer = !isCurrentPlayer;
                }
            }
        }
        System.out.println("Победитель " + (isCurrentPlayer ? name2 : name1) + "!");
    }
}