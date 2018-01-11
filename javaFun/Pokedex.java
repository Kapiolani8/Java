import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
    
    public ArrayList<Object> pokemonInfo(Pokemon pokemon){
        ArrayList<Object> info = new ArrayList<Object>();
        info.add(pokemon.getName());
        info.add(pokemon.getType());
        info.add(pokemon.getHealth());

        return info; 
    }

    public static void main(String[] args){
        Pokedex pokedex = new Pokedex();
        Pokemon pikachu = pokedex.createPokemon("Pikachu", 125, "Electric");
        Pokemon dugtrio = pokedex.createPokemon("DugTrio", 300, "Ground");

        System.out.println(pikachu.getHealth());
        pokedex.attackPokemon(pikachu);
        System.out.println(pikachu.getHealth());


        System.out.println(pokedex.pokemonInfo(dugtrio));

        // ArrayList<Object> p = pokedex.pokemonInfo();
        for (Object pokemon : pokedex.pokemonInfo(dugtrio)){
            System.out.println(pokemon);
        }
        
        System.out.println(Pokemon.getNumberOfPokemon());
    }
}