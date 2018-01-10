public class Mammal{
    private int energy = 100; 

    public Mammal(){

    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public int getEnergy(){
        return energy;
    }

    public int displayEnergy(){
        System.out.println("The gorilla's current energy is : " + energy);

        return energy;
    }
    
}