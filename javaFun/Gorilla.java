public class Gorilla extends Mammal{
    public void throwItem(){
        this.setEnergy(this.getEnergy()-5);

        System.out.println("Gorilla got pissed. Threw feces at you. Watch out.");
    }

    public void eatBananas(){

        this.setEnergy(this.getEnergy()+10); 

        System.out.println("The gorilla is hungry so he found a bunch of bananas to eat.");
    }

    public void climb(){
        this.setEnergy(this.getEnergy()-10); 

        System.out.println("The gorilla need to see who his next victim would be... he climbed a tree.");
    }
}