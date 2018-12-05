package cz.fkreporyje.model;

public class CarModel {

    int speed;
    String model;

    public int getSpeed(){
        return speed;
    }

    public String getModel() {
        return model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "CarModel{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }
}

