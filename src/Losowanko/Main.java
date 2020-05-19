package Losowanko;

import java.util.concurrent.Semaphore;

public class Main {
    static Semaphore semafor = new Semaphore(1);

    public static void main(String[] args) {
        Watek1 wateklosujacy = new Watek1();
        Watek2 watekwypisujacy = new Watek2();
        wateklosujacy.start();
        watekwypisujacy.start();

    }
}