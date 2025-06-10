package astonLearn.dz2;

public class  Tanker extends Transport implements DoesLoot, HaveVint {
    @Override
    public void DoesLooting() {
        System.out.println("Танкер возит груз");
    }

    @Override
    public void haveVint() {
        System.out.println("Танкер имеет винт");
    }

    @Override
    public void move() {
        System.out.println("Танкер двигается");
    }
}
