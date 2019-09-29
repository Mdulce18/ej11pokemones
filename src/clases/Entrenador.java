package clases;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {
    private List<Pokemon> pokebola = new ArrayList<Pokemon>();

    public void atraparPokemon(Pokemon pokemon) {
        pokebola.add(pokemon);
    }

    public Integer cantPokemon() {
        return pokebola.size();
    }

}
