import java.util.ArrayList;

public class CarMechanicGarage <Car> {
    private final int maxCars;
    private ArrayList<Car> garage = new ArrayList<Car>();

    public CarMechanicGarage (int maxCars){
        this.maxCars = maxCars;
    }

    public void addCar (Car car){
        if (garage.size() < maxCars){
            garage.add(car);
        }
    }

    public Car getCar (int index){
        return garage.remove(index);
    }
}
