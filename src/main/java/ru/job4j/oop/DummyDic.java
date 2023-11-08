package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        eng = "Неизвестное слово.";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic ken = new DummyDic();
        String eng = "Unknown word. ";
        System.out.println("Неизвестное слово. " + eng);
    }
}
