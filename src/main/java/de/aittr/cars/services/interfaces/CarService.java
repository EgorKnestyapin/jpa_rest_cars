package de.aittr.cars.services.interfaces;


import de.aittr.cars.domain.Car;

import java.util.List;

public interface CarService {
    Car save(Car car);

    List<Car> getAllCars();
}
