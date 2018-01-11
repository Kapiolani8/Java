public class HumanTest{
    public static void main(String[] args){
        Human kapiolani = new Human("Kapiolani");
        Wizard ryan = new Wizard("Ryan");
        Ninja corey = new Ninja("Corey"); 
        Samurai james = new Samurai("James");

        ryan.attack(kapiolani);
        ryan.fireball(kapiolani); 
        ryan.heal(kapiolani); 

        corey.steal(ryan); 

        james.deathBlow(corey);
        james.meditate(); 

        System.out.println("There is currently " + Samurai.howMany() + " samurai out on the street.");
    }
}