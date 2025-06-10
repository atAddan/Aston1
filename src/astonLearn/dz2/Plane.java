package astonLearn.dz2;

public class Plane extends Transport implements DoesLoot, HaveWheel,HaveWing,HaveVint {
    @Override
    public void DoesLooting() {
        System.out.println("Самолет возит груз");
    }

    @Override
    public void haveVint() {
        System.out.println("Самолет имеет винт");
    }

    @Override
    public void haveWheel() {
        System.out.println("Самолет имеет колеса");
    }

    @Override
    public void haveWing() {
        System.out.println("Самолет имеет крылья");
    }

    @Override
    public void move() {
        System.out.println("Самолет двигается");
    }
}
