import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hippodrome {

    public static Hippodrome game;

    private List<Horse> horses;

    public static void main(String[] args) {
        ArrayList<Horse> horses = new ArrayList<>();
        Horse horse1 = new Horse("\uD83D\uDC0E", 3, 0);
        Horse horse2 = new Horse("\uD83D\uDC0E", 3, 0);
        Horse horse3 = new Horse("\uD83D\uDC0E", 3, 0);
        Collections.addAll(horses, horse1, horse2, horse3);
        Hippodrome hippodrome = new Hippodrome(horses);
        game = hippodrome;
        game.run();
    }

    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                move();
                print();
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {

        }
    }

    public void move() {
        for (Horse horse :horses) {
            horse.move();
        }

    }

    public void print() {
        for (Horse horse :horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public Hippodrome(List horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
