package de.aittr.cars.services;

import de.aittr.cars.domain.Car;
import de.aittr.cars.repositories.CarRepository;
import de.aittr.cars.services.interfaces.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaCarService implements CarService {
    private final CarRepository carRepository;

    public JpaCarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public void deleteByBrand(String brand) {
        carRepository.deleteByBrand(brand);
    }

    public double getMaxPrice() {
        return carRepository.getMaxPrice();
    }
}
