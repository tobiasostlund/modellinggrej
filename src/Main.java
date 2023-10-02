
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(111,"volvo","MåTorstensson",50000);
        Car car2 = new Car(911,"stor bil","Axel Mannheimer",2);

        car1.speedUp(130);
        System.out.println("Hastigheten är " + car1.getSpeed());

        car1.slowDown(50);
        System.out.println("Hastigheten är " + car1.getSpeed());

        car1.stop();
        System.out.println("Hastigheten är " + car1.getSpeed());

        car2.setOwner("Köppa Froppe");

        System.out.println("Bil 2 ägs av "+ car2.getOwner());
    }
}