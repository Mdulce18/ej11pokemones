package Tests;

import clases.*;
import junit.framework.TestCase;

public class EntrenadorTest extends TestCase {
    Entrenador ash = new Entrenador();
    PokemonFuego charizard = new PokemonFuego();
    PokemonAgua psyduck = new PokemonAgua();
    PokemonElectrico pikachu = new PokemonElectrico();
    Lanzallamas lanzallamas = new Lanzallamas();
    Agilidad agilidad = new Agilidad();
    Trueno trueno = new Trueno();
    ColaDeHierro colaDeHierro = new ColaDeHierro();

    public void setUp() {
        ash.atraparPokemon(charizard);
        ash.atraparPokemon(pikachu);
        charizard.aprenderAtaque(lanzallamas);
        pikachu.aprenderAtaque(agilidad);
        pikachu.aprenderAtaque(colaDeHierro);
        pikachu.aprenderAtaque(trueno);
        psyduck.aprenderAtaque(agilidad);
    }

    public void testPotenciaCharizard() {
        assertTrue(charizard.devolverNivelAtaque() == 5);
    }

    public void testPotenciaPikachu() {
        assertTrue(pikachu.devolverNivelAtaque() == 12);
    }

    public void testPotenciaPsyduck() {
        assertTrue(psyduck.devolverNivelAtaque() == 0);
    }

    public void testCantidadPokemones(){
        assertTrue(ash.cantPokemon()==2);
    }

}