public class Wizard extends Human{
    public Wizard(){
        this.setHealth(50); 
        this.setIntelligence(8);
    }

    public Wizard(String name){
        super(name);
    }

    public void heal(Human human){
        human.setHealth(human.getHealth()+this.getIntelligence());
        System.out.println(this.getName()+ " worked their magic on " + human.getName()+ " and they gained " + this.getIntelligence() + " points." );
    }

    public void fireball(Human human){
        int damages = this.getIntelligence()*3; 
        human.setHealth(human.getHealth()-damages);
        System.out.println(this.getName() + " created and then threw a fireball at " + human.getName() + " inflicting " + damages + " damages.");
    }
}