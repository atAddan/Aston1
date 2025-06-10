package astonLearn.dz1;

public class Runner {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Bear bear = new Bear();
        Fish fish = new Fish();
        Whale whale = new Whale();

        System.out.println("\n Те, кто плавает:");
        Swimming[] waterPool = {fish,whale};
        for (Swimming swimming : waterPool) {
            swimming.water();
        }

        System.out.println("\n Те у кого есть шерсть:");
        Woolen[] woolenPool = {cat,bear};
        for (Woolen woolen : woolenPool) {
            woolen.wool();
        }
        System.out.println("\n Наличие позвоночника:");
        System.out.println("Позвоночник у кита: " + whale.isSpine());
        System.out.println("Позвоночник у кошки: " + cat.isSpine());
        System.out.println("Позвоночник у медведя: " + bear.isSpine());


    }
}
