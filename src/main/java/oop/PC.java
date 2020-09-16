package oop;

public class PC {
    private Case case1;
    private Motherboard mot;
    private Monitor monitor;
    int x; int y; String color = "White";
    String programName = "Windows";


    public PC(Case case2, Motherboard motherboard, Monitor monitor){
        this.case1 = case2;
        this.mot = motherboard;
        this.monitor = monitor;
    }
    public Case getCase1(){
        return case1;
    }
    public void setCase1(){
        this.case1 = case1;
    }

    public Motherboard getMot() {
        return mot;
    }

    public void setMot(Motherboard mot) {
        this.mot = mot;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    private void drawLogo(){
        monitor.drawPixel(x, y, color);
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        System.out.println("This pc has a " + case1 + " case, " + mot + " motherboard, and " +
                monitor + " monitor.");
    }
    public void powerUp(){
        case1.pressPowerButton();
        drawLogo();
        mot.loadProgram(programName);
    }
}

