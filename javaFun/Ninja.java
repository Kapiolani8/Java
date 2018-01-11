public class Ninja extends Human{
    public Ninja(){
        this.setStealth(10);
    }

    public Ninja(String name){
        super(name);
    }

    public void steal(Human human){
        int damage = human.getHealth()-this.getStealth();
        human.setHealth(damage);
        this.setHealth(this.getHealth()+damage);
        System.out.println(human.getName()+ " lost " + damage + " health. " + this.getName() + " gained " + this.getStealth()+ " stealth.");
        
    }
}