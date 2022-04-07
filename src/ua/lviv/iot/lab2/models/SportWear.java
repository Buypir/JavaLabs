package ua.lviv.iot.lab2.models;

public class SportWear {
    private String name;
    private int quantity;
    private String origin;
    private String color;
    private int priceInUah;
    private String sex;
    private String material;
    private boolean isAdult;
    private String brand;
    private float percentageOfCotton;

    public SportWear(String name, int quantity, String origin, String color, int priceInUah, String sex, String material,
                     boolean isAdult, String brand, float percentageOfCotton) {
        this.brand = brand;
        this.name = name;
        this.quantity = quantity;
        this.origin = origin;
        this.color = color;
        this.priceInUah = priceInUah;
        this.sex = sex;
        this.material = material;
        this.percentageOfCotton = percentageOfCotton;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPriceInUah() {
        return priceInUah;
    }

    public void setPriceInUah(int priceInUah) {
        this.priceInUah = priceInUah;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPercentageOfCotton() {
        return percentageOfCotton;
    }

    public void setPercentageOfCotton(float percentageOfCotton) {
        this.percentageOfCotton = percentageOfCotton;
    }


    @Override
    public String toString() {
        return
                "name:" + name + ", brand:" + brand +
                        ", quantity:" + quantity +
                        ", origin:" + origin +
                        ", color:" + color +
                        ", priceInUah:" + priceInUah +
                        " uah, sex:" + sex +
                        ", material:" + material +
                        ", percentage of cotton: " + percentageOfCotton +
                        "%, isAdult:" + isAdult + ", ";

    }
}
