package astonLearn.dz2;

public class Boat extends Transport implements DoesLoot, HaveVint {
    @Override
    public void DoesLooting() {
        System.out.println("Катер возит груз");
    }

    @Override
    public void haveVint() {
        System.out.println("Катер имеет винт");
    }

    @Override
    public void move() {
        System.out.println("Катер двигается");
    }
}
