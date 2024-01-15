package Problema1;

public class Bicycle extends Vehicle{
    private String brand;
    private String marca;
    private double speed;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public Bicycle(String brand , double speed  , String marca){
        this.brand = brand;
        this.speed =speed;
        this.marca = marca;
    }

    @Override
    public String speedUp() {
        double vitezaInitiala = this.speed;
        this.speed +=10;
        return "Bicicleta: " + this.brand + " viteza initiala " + vitezaInitiala + "viteza finala: " +  this.speed + "a crescut cu: 10km/h" ;
    }

    @Override
    public String toString(){
        return this.brand + " " + this.marca;
    }
}


