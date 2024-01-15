package Problema4;

public class Rectangle {



    private double width;
    private double lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double perimetru(){
        return this.lenght * 2 + this.width * 2;
    }

    public double arie(){
        return width * lenght;
    }

}
