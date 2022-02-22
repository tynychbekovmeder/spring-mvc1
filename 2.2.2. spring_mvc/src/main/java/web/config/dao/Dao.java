package web.config.dao;

import web.model.Car;

import java.util.List;

public interface Dao {
    List<Car> getCar(int choose);
    List<Car> getAllCars();
}
