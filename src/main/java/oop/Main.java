package oop;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC(new Case("ATX Mid Tower", "Corsair", "EVGA 550W",
                new Dimensions(19,8,20)), new Motherboard("AMD","MSI",
                4,4, "Ryzen"), new Monitor("Curved Ultrawide", "LG",
                new Resolution(21, 9)));
        pc.description();
        pc.powerUp();
    }
}
