public class Pokemon{
    private String name = " "; 
    private int health = 0 ; 
    private String type = " "; 

    public static int numberOfPokemon = 0; 

    // public Pokemon(){
    //     numberOfPokemon++;
    // }

    public Pokemon(String name, int health, String type){
        this.name = name; 
        this.health = health;
        this.type = type; 
        numberOfPokemon++;
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

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type; 
    }

    public static String getNumberOfPokemon(){

        return "There are " + numberOfPokemon  + " in the wild!!! Go catch them ALL.";
    }
}