package ua.lviv.iot.lab2.models;

public class Tracksuit extends Outerwear{
    private String purpose;     //gym clothes, clothes for outdoor sports, walking suits
    private boolean isSameDesign;
    public Tracksuit(int quantity, String origin, String color, int priceInUah, String name, String brand,
                     String sex, String material, boolean isAdult, String sizeInLetters, boolean isSameDesign,
                     boolean isHasHood, String purpose, String season, float percentageOfCotton) {
        super(quantity, origin, color, priceInUah, sex, name, brand, material, isAdult,
                sizeInLetters, isHasHood, season, percentageOfCotton);
        this.purpose = purpose;
        this.isSameDesign = isSameDesign;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public boolean isSameDesign() {
        return isSameDesign;
    }

    public void setSameDesign(boolean sameDesign) {
        isSameDesign = sameDesign;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", purpose:" + purpose +
                ", isSameDesign:" + isSameDesign + "]\n";

    }
}
