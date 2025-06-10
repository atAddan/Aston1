package astonLearn.dz1;

public class Whale extends Mammal implements Swimming {
    @Override
    public void water() {
        System.out.println("Кит плавает");
    }

    @Override
    public void eat() {
        System.out.println("Кит Ест");
    }

}
