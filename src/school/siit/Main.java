package school.siit;

public class Main {
    public static void main(String[] args) {
        //Car car = new Car();
        //Car car = new VW(27, "oiqe0934hkkadsn");
        //Car car = new VWPolo(35, "oiqe0934hkkadsn");
        Car car = new MercedesSKlasse(30, "1987ddkshik289");

        car.start();

        car.shiftGear(1);

        car.drive(0.01);// drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02);

        car.shiftGear(3);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(3);

        car.drive(0.1);

        car.stop();

        car.print();
    }
}