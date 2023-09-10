package controllers;

import utils.PropertyReader;

public class initMethod {
    public static String browser = PropertyReader.readProperties("Browser").toLowerCase();


}
