package web.dao;


import org.springframework.stereotype.Repository;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Toyota", "Land Cruiser", "300"));
        carList.add(new Car("Chevrolet", "Corvette", "V"));
        carList.add(new Car("Mazda", "CX-5", "II"));
        carList.add(new Car("Honda", "Civic", "VI"));
        carList.add(new Car("Honda", "Accord", "VIII"));
    }

    @Override
    public List<Car> getCar(int count) {
        if (count != 0){
            return carList.stream().limit(count).collect(Collectors.toList());
        }
        return carList;
    }
}
