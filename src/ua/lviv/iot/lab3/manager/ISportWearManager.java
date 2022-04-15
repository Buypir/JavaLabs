package ua.lviv.iot.lab3.manager;

import ua.lviv.iot.lab3.models.SportWear;

import java.util.List;

public interface ISportWearManager {
    void addWears(List<SportWear> sportWears);
    SportWear findByPrice(List<SportWear> sportWears, double price);
    SportWear findByBrand(List<SportWear> sportWears, String brand);
    void sortByPrice(List<SportWear> sportWears, boolean reversed);


}
