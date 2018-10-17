package com.iesemilidarder.dbonnin.controller;

import com.iesemilidarder.dbonnin.data.Car;
import com.iesemilidarder.dbonnin.data.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyFirstController {
    @RequestMapping("/car")
    public Vehicle getCar(@RequestParam(value="name", defaultValue="World") String name) {
        Car car = new Car();
        car.setName(name);
        return car;
    }
}

