package ua.lviv.iot.lab2.models;

public class Backpack extends SportWear{
    private int numberOfPockets;
    private boolean isHasPowerBank;


    public Backpack(int quantity, String origin, String color, int priceInUah, String name, String brand,
                    String sex, String material, boolean isAdult, int numberOfPockets, float percentageOfCotton,
                    boolean isHasPowerBank) {
        super(name, quantity, origin, color, priceInUah, sex, material, isAdult, brand, percentageOfCotton);
        this.numberOfPockets = numberOfPockets;
        this.isHasPowerBank = isHasPowerBank;
    }

    public int getNumberOfPockets() {
        return numberOfPockets;
    }

    public void setNumberOfPockets(int numberOfPockets) {
        this.numberOfPockets = numberOfPockets;
    }

    public boolean isHasPowerBank() {
        return isHasPowerBank;
    }

    public void setHasPowerBank(boolean hasPowerBank) {
        isHasPowerBank = hasPowerBank;
    }

    @Override
    public String toString() {
        return "[" + super.toString() +
                "numberOfPockets:" + numberOfPockets +
                ", isHasPowerBank:" + isHasPowerBank + "]\n";

    }
}
