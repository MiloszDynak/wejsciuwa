package Losowanko;

import java.util.Random;

import static Losowanko.Main.semafor;

public class Watek1 extends Thread {
    Random random = new Random();
    int i = 0;

    @Override
    public void run() {
        super.run();
        try {
            while (i < 11) {
                semafor.acquire();
                int a = random.nextInt(45);
                System.out.println("W1 Losowanie liczby nr " + i + " wylosowano " + a);
                Watek2.kwadrat(a);
                i++;
                semafor.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}