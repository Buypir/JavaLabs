package ua.lviv.iot.lab2;
import ua.lviv.iot.lab2.models.*;
public class Main {

    public static void main(String[] args) {
    Backpack SportBag = new Backpack(5, "Indonesia", "black", 700, "Sport Bag", "Reebok",
                                     "Unisex", "Cotton", true, 3, 36.2f, true);
    System.out.print(SportBag);
    Outerwear Hoodie = new Outerwear(17,"Vietnam", "White", 1250, "male", "Hoodie", "Puma",
                                     "Cotton", true, "L", true,"All Season", 80.4f);
    System.out.println(Hoodie);
    Sneakers AirForce = new Sneakers(12, "Vietnam", "white", 1800,"Unisex", "Synthetic leather",
                                     "Air Force 1", "Nike", 0f,true, 22, "rubber","White");
    System.out.println(AirForce);
    ThermalUnderwear ThermalSuit = new ThermalUnderwear(37, "USA", "Green", 1500, "male", "Cotton",
                                                        false, "Thermal Suit", true, 42.5f, "Adidas");

    System.out.print(ThermalSuit);
    Tracksuit Tracksuit = new Tracksuit(4, "Ukraine", "red", 700, "Sport suit", "Nike", "male", "Cotton", false,"XL",
                                        true, false,"clothes for outdoor sports", "Spring",44f);
    System.out.print(Tracksuit);

    }
}
