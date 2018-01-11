public abstract class AbstractPokemon implements PokemonInterface{
    
    public Pokemon createPokemon(String name, int health, String type){
        Pokemon pokemon = new Pokemon(name, health, type);
        return pokemon; 
    }
    
    public void attackPokemon(Pokemon pokemon){
        pokemon.setHealth(pokemon.getHealth() - 10);
    }

}