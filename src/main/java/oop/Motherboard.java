package oop;

public class Motherboard {
    private String model; String manufacturer; int ramSlots; int cardSlots; String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println(programName + " is now running");
    }
    public String toString(){
        return model + " " + manufacturer + " with " + ramSlots + " ramSlots, and " + cardSlots +
        " cardslots and " + bios + " BIOS";
    }
}
