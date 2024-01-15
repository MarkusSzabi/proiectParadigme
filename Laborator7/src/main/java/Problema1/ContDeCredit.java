package Problema1;

public class ContDeCredit extends Cont{





    public ContDeCredit(double balance){
        super(balance);
    }

    public ContDeCredit(){
        super();
    }




    @Override
    public void withdraw(double withdrawValue) {
        if(this.balance < withdrawValue){
            this.balance =- withdrawValue;
            System.out.println("Balanta: " + this.balance);
        }else{
            this.balance =-withdrawValue;
            System.out.println("Balanta " + this.balance );
        }
    }

    @Override
    public String toString(){
        return "Cont de Credit " + "Balanta : " + this.balance + " Id: " + this.id;
    }

}
