package com.iesemilidarder.dbonnin.schoolthings;

import com.iesemilidarder.dbonnin.data.Car;
import com.iesemilidarder.dbonnin.data.Vehicle;

import java.util.ArrayList;

public class Playground {
    public static void main(String... args) {
        System.out.println("Funciono");
        ;
        int numItems = 6;
        ArrayList<Vehicle> Car = new ArrayList<>();
        for (int i = 0; i < numItems; i++) {
            System.out.println("Car" + 1);
            Vehicle item = new Car();
            item.setName("Element " + i);
            item.setDuration(i * 10);
        }
        System.out.println("Fin");
    }
}