package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже\n"
                    + "Пешеходы по лужам,\n"
                    + "А вода по асфальту рекой.\n"
                    + "И неясно прохожим\n"
                    + "В этот день непогожий,\n"
                    + "Почему я веселый такой.");
        } else if (position == 2) {
            System.out.println("Сегодня мне очень хорошо,\n"
                    + "Сегодня я c тобой гуляю,\n"
                    + "По тёмным улицам, зовущим в себя,\n"
                    + "Мы с тобой дышим городом.\n"
                    + "Мы с тобой смотрим под ноги,\n"
                    + "Мы с тобой, это просто ты и я.");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(3);
        song.music(0);
    }
}
