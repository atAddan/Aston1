package astonLearn.dz1;

public class Fish extends Animal implements Swimming {
    @Override
    public void water() {
        System.out.println("Рыба плавает");
    }

    @Override
    public void eat() {
        System.out.println("Рыба ест");
    }
}
