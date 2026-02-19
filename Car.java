public class Car {
    private int ID;
    private String brand;
    private String model ;
    private String color ;
    private int year;
    private double price ;
    private boolean available ;
    private int Id;

    public Car(){}
    public int getID(){
        return ID;
    }
    public void setID(int ID) {
        this.ID = Id;
    }
    public String getBrand(){
        return brand;

    }
    public void setBran(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getColor(){
        return color;

    }
    public void setColor(String color){
        this.color = color;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;

    }
    public double getaPrice(){
        return price;

    }
    public void setPrice(double price){
        this.price = price;

    }
    public boolean getAvailable(){
        return available;

    }
    public void setAvailable(boolean available){
        this.available = available;
    }
}
