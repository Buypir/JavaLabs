package ua.lviv.iot.lab3.manager.impl;

import ua.lviv.iot.lab3.manager.ISportWearManager;
import ua.lviv.iot.lab3.models.*;

import javax.swing.*;
import java.util.*;

public class SportWearManager implements ISportWearManager {
    private Map<Double, List<SportWear>> wearsMap = new HashMap<>();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void addWears(List<SportWear> sportWears) {
        sportWears.forEach(sportWear -> {
            double price = sportWear.getPriceInUah();
            var existingWears = wearsMap.get(price);
            if(existingWears == null) {
                existingWears = new LinkedList<SportWear>();
                wearsMap.put(price, existingWears);
            }
            existingWears.add(sportWear);
        });
    }

    @Override
    public SportWear findByPrice(List<SportWear> sportWears, double priceInUah) {
        for(SportWear sportWear : sportWears) {
            if(sportWear.getPriceInUah().equals(priceInUah)) {
                return sportWear;
            }
        }
        return null;
    }

    @Override
    public SportWear findByBrand(List<SportWear> sportWears, String brand) {
        return null;
    }

    @Override
    public void sortByPrice(List<SportWear> sportWears, boolean reversed) {

    }


}
