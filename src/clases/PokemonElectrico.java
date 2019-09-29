package clases;

import java.util.ArrayList;
import java.util.List;

public class PokemonElectrico implements Pokemon {
    private Integer nivelAtaque = 0;
    private List<Ataque> ListadoAtaques = new ArrayList<Ataque>();

    private void recorrerAtaquesSumarNivel() {
        for (Ataque potenciaAtaque : ListadoAtaques) { //potenciaAtaque es nomnre generico para objeto de ese Array
            nivelAtaque = nivelAtaque + potenciaAtaque.getPotenciaAtaque();
        }
    }

    public void aprenderAtaque(Ataque unAtaque) {
        ListadoAtaques.add(unAtaque);
    }

    public Integer devolverNivelAtaque() {
        recorrerAtaquesSumarNivel();
        return nivelAtaque;
    }
}
