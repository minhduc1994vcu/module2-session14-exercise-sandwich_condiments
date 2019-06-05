package com.codegym.model;

import java.util.List;

public class Condiment {
    private static List<String> condiment;

    public static List<String> getCondiment() {
        return condiment;
    }

    public  void setCondiment(List<String> condiment) {
        Condiment.condiment = condiment;
    }
}
