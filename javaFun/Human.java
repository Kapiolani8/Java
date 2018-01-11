public class Human{ 
    private String name = ""; 
    private int stealth = 3; 
    private int intelligence = 3; 
    private int strength = 3; 
    private int health = 100; 

    public Human(){}

    public Human(String name){
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

    public void setIntelligence(int intelligence){
        this.intelligence = intelligence; 
    }

    public int getIntelligence(){
        return intelligence;
    }

    public void setStealth(int stealth){
        this.stealth = stealth;
    }

    public int getStealth(){
        return stealth;
    }

    public void attack(Human human){
        human.setHealth(human.getHealth()-strength);
        System.out.println(this.getName() + " attacked " + human.getName() + " making their health " + health);
    }
}