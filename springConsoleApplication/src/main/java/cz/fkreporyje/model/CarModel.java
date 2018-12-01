package cz.fkreporyje.model;

public class CarModel {

    int speed;
    String model;

    public CarModel(int speed, String model){
        this.speed=speed;
        this.model=model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }
}

