package Problema3;

public class Problema3 {
    public static void main(String[] args) {


        Dog caine1 = new Dog("Tobi" , "Beagle");
        Dog caine2 = new Dog("Pufi" , "Dobermann");

        System.out.println("Caine1 nume: " + caine1.getName() + " rasa: "  + caine1.getBreed());
        System.out.println("Caine2 nume: " + caine2.getName() + " rasa: "  +  caine2.getBreed());

//        Seteaza nume si rasa
        System.out.println();

        caine1.setBreed("Maidanez");
        caine1.setName("Max");

        caine2.setBreed("Labrador");
        caine2.setName("Rex");

        System.out.println("Caine1 nume: " + caine1.getName() + " rasa: "  + caine1.getBreed());
        System.out.println("Caine2 nume: " + caine2.getName() + " rasa: "  +  caine2.getBreed());
    }
}
