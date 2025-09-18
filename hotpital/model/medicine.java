
package hotpital.model;

public class medicine {
    protected String name;
    protected String description;
    protected String manufacturer;
    protected double price;
    protected int stock; // quantity in stock  
    protected medicine(String name, String description, String manufacturer, double price, int stock){
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.price = price;
        this.stock = stock;
    }
    public String getName(){
        return this.name;   
}
    public String getDescription(){
        return this.description;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public double getPrice(){
        return this.price;
}
    public int getStock(){
        return this.stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
}   