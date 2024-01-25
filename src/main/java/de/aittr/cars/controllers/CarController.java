package de.aittr.cars.controllers;

import de.aittr.cars.domain.Car;
import de.aittr.cars.services.JpaCarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private final JpaCarService carService;

    public CarController(JpaCarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carService.save(car);
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getAllCars();
    }

    @DeleteMapping("/{brand}")
    public void deleteCarByBrand(@PathVariable String brand) {
        carService.deleteByBrand(brand);
    }

    @GetMapping("/maxPrice")
    public double getMaxPrice() {
        return carService.getMaxPrice();
    }
}
