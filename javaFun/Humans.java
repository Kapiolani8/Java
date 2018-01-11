public class Humans{ 
    private String name; 
    private int stealth; 
    private int intelligence; 
    private int strength; 
    private int health; 

    public Humans(String name){
        this.name = name;
        this.strength = 3; 
        this.intelligence = 3; 
        this.stealth = 3; 
        this.health = 100; 
    }

    public void setName(String name){
        this.name = name; 
    }

    public String getName(){
        return name; 
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public int getStrength(){
        return strength;
    }

    public void attack(Humans human){
        human.setHealth(human.getHealth()-getStrength());
        System.out.println(this.getName() + " attacked " + human.getName() + " making their health " + health);
    }
}