public class Samurai extends Human{ 
    private static int numberOfSamurais = 0; 

    public Samurai(){
        this.setHealth(200);
        numberOfSamurais++;
    }

    public Samurai(String name){
        super(name);
        numberOfSamurais++;
    }

    public void deathBlow(Human human){
        human.setHealth(0);
        this.setHealth(this.getHealth()/2);
        System.out.println(this.getName() + " MURDERED " + human.getName());
    }

    public void meditate(){
        int gainedEnlightenment = this.getHealth();
        this.setHealth(this.getHealth()+ gainedEnlightenment);

        System.out.println(this.getName() + " gained enlightenment and " + gainedEnlightenment + " points of health.");
    }

    public static int howMany(){
        return numberOfSamurais;
    }
}