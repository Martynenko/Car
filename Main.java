public class Main {

    public static void main(String[] args) {
      /*Car car = new Car();
        car.type = "crossover";
        car.averageSpeed = 100;
        car.quantityOfDoors = 4;


        System.out.println("модель авто - " + car.type);
        System.out.println("скорость авто - " + car.averageSpeed);*/

        BMV bmv = new BMV();
        bmv.setType("bmv");
        bmv.run();
        bmv.stop();

        Mazda mazda = new Mazda();
        mazda.setType("mazda");
        mazda.run();
        mazda.stop();

    }
}


