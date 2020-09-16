package oop;

public class Case {
    String model;
    String manufacturer;
    String powerSupply;
    Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions){
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;

    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }
    public String toString(){
        return model + " " + manufacturer+ " with a " +powerSupply + " powersupply and " +dimensions;
    }
}
