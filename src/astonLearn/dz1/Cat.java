package astonLearn.dz1;

public class Cat extends Mammal implements Woolen {
    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    @Override
    public void wool() {
        System.out.println("Кошка чешет шерсть");
    }
}
