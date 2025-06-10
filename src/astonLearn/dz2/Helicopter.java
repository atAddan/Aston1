package astonLearn.dz2;

public class Helicopter extends Transport implements DoesLoot, HaveVint, HaveWheel {
    @Override
    public void DoesLooting() {
        System.out.println("Вертолет возит груз");
    }

    @Override
    public void haveVint() {
        System.out.println("Вертолет имеет винт");
    }

    @Override
    public void haveWheel() {
        System.out.println("Вертолет имеет колеса");
    }

    @Override
    public void move() {
        System.out.println("Вертолет двигается");
    }
}
