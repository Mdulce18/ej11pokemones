package clases;

public class PokemonAgua implements Pokemon {
    private Integer nivelAtaque = 0;

    public void aprenderAtaque(Ataque unAtaque) {
        nivelAtaque = 0;
    }

    public Integer devolverNivelAtaque() {
        return nivelAtaque;
    }
}
