package clases;

public class PokemonFuego implements Pokemon{
    private Integer nivelAtaque=0;

    public void aprenderAtaque(Ataque unAtaque){
        nivelAtaque=unAtaque.getPotenciaAtaque();
    }

    public Integer devolverNivelAtaque() {
        return nivelAtaque;
    }
}
