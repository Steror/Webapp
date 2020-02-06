package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@RestController
public class CarController {
    private CarRepository repository;

    public CarController(CarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Car> Cars() {
        return new ArrayList<>(repository.findAll());
    }

    @GetMapping("/cars/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Optional<Car> Car(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping("/cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public void AddCar(@RequestBody Car car) {
        repository.save(car);
    }

    @PutMapping("/cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public void UpdateCar(@RequestBody Car car) {
        repository.save(car);
    }

    @DeleteMapping("/cars/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void DeleteCar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
