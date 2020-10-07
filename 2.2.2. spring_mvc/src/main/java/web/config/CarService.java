package web.config;

import web.config.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Bugatti", 100, 2005));
        cars.add(new Car("Ferrari", 470, 2010));
        cars.add(new Car("Ford", 200, 2015));
        cars.add(new Car("Bentley ", 350, 2020));
        cars.add(new Car("Tesla", 560, 2018));
    }

    public List<Car> getCars(Integer count) {
        if (count == null) {
            count = 5;
        }
        return cars.stream().limit(Math.min(count, 5)).collect(Collectors.toList());
    }
}
