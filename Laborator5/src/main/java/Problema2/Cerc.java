package Problema2;

public class Cerc implements Forma {
    private double raza;

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double arie(){
        return 3.14 * (raza * raza);
    }

    public double perimetru(){
        return 2 * 3.14 * raza;
    }

    public Cerc(double raza){
        this.raza = raza;
    }

    @Override
    public String toString(){
        return "Cerc--> " + "Arie: " + this.arie() + " Perimetru: " + this.perimetru();
    }

}
