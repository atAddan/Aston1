package astonLearn.dz2;

public class Runner {
    public static void main(String[] args) {
        Boat boat = new Boat();
        Helicopter helicopter = new Helicopter();
        Plane plane = new Plane();
        Tanker tanker = new Tanker();
        Taxi taxi = new Taxi();
        Truck truck = new Truck();

        System.out.println("\n ТС с колесами:");
        HaveWheel[] wheelPool = {helicopter,plane,truck,taxi};
        for (HaveWheel haveWheel : wheelPool) {
            haveWheel.haveWheel();
        }

        System.out.println("\n ТС с винтом:");
        HaveVint[] vintPool = {boat,helicopter,plane,tanker};
        for (HaveVint haveVint : vintPool) {
            haveVint.haveVint();
        }


        System.out.println("\n ТС с крыльями:");
        plane.haveWing();

        System.out.println("\n ТС возят грузы:");
        DoesLoot[] doesLootsPool ={plane,helicopter,tanker,truck,boat};
        for (DoesLoot doesLoot : doesLootsPool) {
            doesLoot.DoesLooting();
        }


    }
}
