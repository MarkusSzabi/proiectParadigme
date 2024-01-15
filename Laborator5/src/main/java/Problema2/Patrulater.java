package Problema2;

public  class Patrulater implements Forma{
    private double lungime;
    private double latime;

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public Patrulater(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public double perimetru(){
        return this.latime * 2 + this.lungime * 2;
    }

    public double arie(){
        if(this.lungime == this.latime){
            return lungime * lungime;
        }
        return lungime * latime;
    }

    @Override
    public String toString(){
        if(this.lungime == this.latime){
            return "Patrat-->" + " Perimetru:" + this.perimetru() + " Arie:" + this.arie();
        }
        return "Dreptunghi-->" + " Perimetru:" + this.perimetru() + " Arie:" + this.arie();
    }

}
