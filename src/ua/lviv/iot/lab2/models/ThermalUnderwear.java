package ua.lviv.iot.lab2.models;

public class ThermalUnderwear extends SportWear {
    private boolean isTightFitting;


    public ThermalUnderwear(int quantity, String origin, String color, int priceInUah,
                            String sex, String material, boolean isAdult, String name,
                            boolean isTightFitting, float percentageOfCotton, String brand) {
        super(name, quantity, origin, color, priceInUah, sex, material, isAdult, brand, percentageOfCotton);
        this.isTightFitting = isTightFitting;

    }

    public boolean getIsTightFitting() {
        return isTightFitting;
    }

    public void setIsTightFitting(boolean isTightFitting) {
        this.isTightFitting = isTightFitting;
    }



    @Override
    public String toString() {
        return "[" + super.toString() +
                "isTightFitting:" + isTightFitting + "]\n";


    }
}
