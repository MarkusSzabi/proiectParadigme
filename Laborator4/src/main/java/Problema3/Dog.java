package Problema3;

public class Dog {
    private String name;
    private String breed;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name ,String breed){
        setName(name);
        setBreed(breed);
    }

    @Override
    public String toString(){
        return this.name + this.breed;
    }
}
