public class Dragon extends Mammal{
    public Dragon(){
        this.setEnergy(300);
    }

    public void fly(){
        System.out.println("Holy shit! It's a flying dragon!!"); 

        this.setEnergy(this.getEnergy()-50); 

    }

    public void eatHumans(){
        System.out.println("oh. shit. it just ate someone.  I don't think the zoo is feeding it enough...");

        this.setEnergy(this.getEnergy()+25); 
    }

    public void attackTown(){
        System.out.println("AHHHHHH THE TOWN IS BURING THE TOWN IS BURNING."); 

        this.setEnergy(this.getEnergy()-100);
    }
}