package com.autosys.model;

public class Car {
    private String id;
    private String name;
    private String brand;
    private MauSac color;
    private long price;
    private String image;

    public Car() {}

    public Car(String id, String name, String brand, MauSac color, long price, String image) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.image = image;
    }

    // getters & setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public MauSac getColor() { return color; }
    public void setColor(MauSac color) { this.color = color; }
    public long getPrice() { return price; }
    public void setPrice(long price) { this.price = price; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
