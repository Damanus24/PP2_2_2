package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("VAZ", 2101, "red"));
        cars.add(new Car("VAZ", 2106, "black"));
        cars.add(new Car("VAZ", 2109, "grey"));
        cars.add(new Car("VAZ", 2112, "white"));
        cars.add(new Car("VAZ", 2114, "blue"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
