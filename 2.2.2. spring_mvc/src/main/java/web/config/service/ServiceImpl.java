package web.config.service;

import web.config.dao.Dao;
import web.config.dao.DaoImpl;
import web.model.Car;
import java.util.List;

public class ServiceImpl implements Service{
    Dao dao = new DaoImpl();
    @Override
    public List<Car> getCars(int choose) {
        return dao.getCar(choose);
    }

    @Override
    public List<Car> getAllCars() {
        return dao.getAllCars();
    }
}
