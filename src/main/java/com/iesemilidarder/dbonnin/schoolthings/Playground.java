package com.iesemilidarder.dbonnin.schoolthings;

import com.iesemilidarder.dbonnin.data.Vehicle;

import java.util.ArrayList;

public class Playground {
    /**
    public static void main (String... args) {
        System.out.println("Funciono");;
        int numItems = 6;
        ArrayList<Activity> items = new ArrayList<>();
        for (int i = 0;i<numItems;i++) {
            System.out.println("Iteration" + 1);
            Activity item = new Activity();
            item.setName("Elemento "+ i);
            item.setDuration(i*10);
            item.add(item);
        }
        System.out.println("Fin");
    }**/
    public static void main (String... args) {
        System.out.println("Funciono");;
        int numItems = 6;
        ArrayList<Vehicle> car = new ArrayList<>();
        for (int i = 0;i<numItems;i++) {
            System.out.println("Iteration" + 1);
            Vehicle item = new car();
            item.setName("Elemento "+ i);
            item.setDuration(i*10);
            item.add(item);
        }
        System.out.println("Fin");
}
