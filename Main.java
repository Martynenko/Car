public class Main {

    public static void main(String[] args) {
      Car car = new Car();
        car.type = "crossover";
        car.averageSpeed = 100;
        car.quantityOfDoors = 4;


        System.out.println("модель авто - " + car.type);
        System.out.println("скорость авто - " + car.averageSpeed);

        Car bmv = new Car();
        bmv.setType("bmv");
        bmv.run();
        bmv.stop();

        Car mazda = new Car();
        mazda.setType("mazda");
        mazda.run();
        mazda.stop();

    }
}


