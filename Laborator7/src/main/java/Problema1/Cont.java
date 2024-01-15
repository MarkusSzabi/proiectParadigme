package Problema1;

import java.util.Random;

public abstract class Cont  {

   protected double balance;
   protected int id;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Cont(double balance){
        Random rnd = new Random();
        this.id = rnd.nextInt(100);

        this.balance = balance;
    }

    public Cont(){
        Random rnd = new Random();
        this.id = rnd.nextInt();
    }

    public abstract void withdraw(double withdrawValue);

    public void deposit(double depositValue){
        this.balance +=depositValue;
    }

}
