package web.services;

import web.models.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCar(int count);
}
