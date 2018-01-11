import java.util.ArrayList;

public interface PokemonInterface{
    Pokemon createPokemon(String name, int health, String type);

    void attackPokemon(Pokemon pokemon);

    ArrayList<Object> pokemonInfo(Pokemon pokemon);
}