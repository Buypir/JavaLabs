package ua.lviv.iot.lab2.models;

public class Sneakers extends SportWear {
    private int sizeInCentimeters;
    private String soleMaterial;
    private String colorOfLaces;


    public Sneakers(int quantity, String origin, String color,
                    int priceInUan, String sex, String material, String name, String brand, float percentageOfCotton,
                    boolean isAdult, int sizeInCentimeters, String soleMaterial, String colorOfLaces) {
        super(name, quantity, origin, color, priceInUan, sex, material, isAdult, brand, percentageOfCotton);
        this.sizeInCentimeters = sizeInCentimeters;
        this.soleMaterial = soleMaterial;
        this.colorOfLaces = colorOfLaces;
    }

    public int getSizeInCentimeters() {
        return sizeInCentimeters;
    }

    public void setSizeInCentimeters(int sizeInCentimeters) {
        this.sizeInCentimeters = sizeInCentimeters;
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }

    public String getColorOfLaces() {
        return colorOfLaces;
    }

    public void setColorOfLaces(String colorOfLaces) {
        this.colorOfLaces = colorOfLaces;
    }

    @Override
    public String toString() {
        return "[" + super.toString() +
                "sizeInCentimeters:" + sizeInCentimeters +
                ", soleMaterial:" + soleMaterial +
                ", colorOfLaces:" + colorOfLaces + "]";
    }
}
