package Problema1;

public class ContDeEconomii extends Cont{


    public ContDeEconomii(double balance){
        super(balance);
    }


    public ContDeEconomii(){
        super();
    }

    @Override
    public void withdraw(double withdrawValue) {
        if(this.balance < withdrawValue){
            System.out.println("Suma nu poate fi extrasa");
            return;
        }

        if(withdrawValue > (this.balance * 0.6)){
            System.out.println("Suma nu poate fi mai mare de " + this.balance * 0.6);
        }else{
            this.balance =- withdrawValue;
        }
    }

    @Override
    public String toString(){
        return "Cont De Economii" + "Balanta : " + this.balance + " Id: " + this.id;
    }
}
