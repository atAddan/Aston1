package astonLearn.dz1;

public class Bear extends Mammal implements Woolen {
    @Override
    public void eat() {
        System.out.println("Медведь ест");
    }

    @Override
    public void wool() {
        System.out.println("Медведь чешет шерсть");
    }
}
