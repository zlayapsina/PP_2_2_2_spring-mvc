package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class CarServiceImpl implements CarService {
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

    public List<Car> getCars(Integer count) {
        if (count != null) {
            return listCars.subList(0, count);
        } else {
            return listCars;
        }
    }

}
