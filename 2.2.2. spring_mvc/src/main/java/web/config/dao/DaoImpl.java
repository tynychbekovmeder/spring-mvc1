package web.config.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao {
    List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "GT", "GERMANY"));
        carList.add(new Car(2, "BMW", "GERMANY"));
        carList.add(new Car(3, "TOYOTA", "JAPAN"));
        carList.add(new Car(4, "GTR", "JAPAN"));
        carList.add(new Car(5, "MarkX", "JAPAN"));
    }

    @Override
    public List<Car> getCar(int choose) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < choose; i++) {
            if (choose >= 5) {
                return carList;
            } else {
                cars.add(carList.get(i));
            }
        }
        return cars;
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
