package oop;

public class Dimensions {
    private int height;
    private int width;
    private int depth;

    public Dimensions(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    public String toString(){
        return height +"\"" + width +"\"" +depth +"\" ";
    }

}
