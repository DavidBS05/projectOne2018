package com.iesemilidarder.dbonnin;

import com.iesemilidarder.dbonnin.data.Moto;
import com.iesemilidarder.dbonnin.data.SystemUtilHelper;
import com.iesemilidarder.dbonnin.data.Vehicle;

public class Launcher {
    public static void main(String... args) {
        SystemUtilHelper.consolePrint("Concesionario brumbrum App 2.0");
        Moto moto = new Moto();
        moto.setNumWheels(2);
        moto.setPrice(123.45);
        moto.setColor("Blanco");
        System.out.println("Ruedas"+moto.getNumWheels());
        moto.start();
        SystemUtilHelper.consolePrint("pista que voy!");
        moto.brake();
        Vehicle aux = new Moto();
        SystemUtilHelper.consolePrint("yuhu!!");
    }
}

