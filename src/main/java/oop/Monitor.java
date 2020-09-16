package oop;

public class Monitor {
    Resolution reso;
    String model;
    String manufacturer;

    public Monitor(String model, String manufacturer, Resolution reso){
        this.manufacturer = manufacturer;
        this.model = model;
        this.reso = reso;
    }
    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at \""+ x + "\",\""+ y + "\" \" "+ color+" in color.");
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
    public String toString(){
        return model + " " + manufacturer + " "+ reso +" \" ";
    }
}
