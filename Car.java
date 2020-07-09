public class Car {
    public String type;
    public int averageSpeed;
    public int quantityOfDoors;
    public int maxSpeed;
    public String model;
    public String color;

    public void run() {
        //...ехать
        System.out.println("Car " + type + " run" );
    }

    public void stop() {
        //...остановиться
        System.out.println("Car " + type + " stoped" );

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public int getQuantityOfDoors() {
        return quantityOfDoors;
    }

    public void setQuantityOfDoors(int quantityOfDoors) {
        this.quantityOfDoors = quantityOfDoors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
