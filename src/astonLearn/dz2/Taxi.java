package astonLearn.dz2;

public class Taxi  extends Transport implements HaveWheel {
    @Override
    public void haveWheel() {
        System.out.println("Такси имеет колеса");
    }

    @Override
    public void move() {
        System.out.println("Такси двигается");
    }
}
