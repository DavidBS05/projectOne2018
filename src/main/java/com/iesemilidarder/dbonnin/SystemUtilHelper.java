package com.iesemilidarder.dbonnin;

public class SystemUtilHelper {

    private SystemUtilHelper() {
        //Todo: OS gereralization
    }

    public static void consolePrint (String message) {
        System.out.println(message);
    }

    public static void logError(Exception e) {
        consolePrint("ERROR:"+ e);
    }
}
