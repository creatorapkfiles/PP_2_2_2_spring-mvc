package web.services;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCar(int count) {
        return carDao.getCar(count);
    }
}
