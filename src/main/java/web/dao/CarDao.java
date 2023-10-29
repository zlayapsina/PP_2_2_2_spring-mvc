package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private static int CAR_COUNT;
    private List<Car> listCars;

    {
        listCars = new ArrayList<>();
        listCars.add(new Car(++CAR_COUNT, "ford", 10));
        listCars.add(new Car(++CAR_COUNT, "bmv", 20));
        listCars.add(new Car(++CAR_COUNT, "toyota", 23));
        listCars.add(new Car(++CAR_COUNT, "mazda", 76));
        listCars.add(new Car(++CAR_COUNT, "lada", 98));
    }

    public List<Car> carCount(int count) {
        return listCars.subList(0, count);
    }

    public List<Car> carList() {
        return listCars;
    }

}
