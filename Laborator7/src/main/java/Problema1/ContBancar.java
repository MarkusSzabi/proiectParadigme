package Problema1;

public class ContBancar extends Cont{


    public ContBancar(){
        super();
    }
    public ContBancar(double balance){
        super(balance);
    }



    public void withdraw(double withdrawValue){
        if(this.balance < withdrawValue){
            System.out.println("Suma prea mare incearca o suma mai mica decat " + this.balance);
        }
    }

    @Override
    public String toString(){
        return "Cont Bancar" + "Balanta : " + this.balance + " Id: " + this.id;
    }


}
