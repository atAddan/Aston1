package astonLearn.dz2;

public class Truck extends Transport implements DoesLoot, HaveWheel {
    @Override
    public void DoesLooting() {
        System.out.println("Грузовик возит груз");
    }

    @Override
    public void haveWheel() {
        System.out.println("Грузовик имеет колеса");
    }

    @Override
    public void move() {
        System.out.println("Грузовик двигается");
    }
}
