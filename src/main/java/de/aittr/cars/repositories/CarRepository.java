package de.aittr.cars.repositories;

import de.aittr.cars.domain.Car;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepository extends JpaRepository<Car, Integer> {
    @Transactional
    void deleteByBrand(String brand);

    @Query(value = "select max(price) from car", nativeQuery = true)
    double getMaxPrice();
}
