package pokemon_batle.pokemons;

import java.util.Random;
import pokemon_batle.Pokemon;

public class Chikorita extends Pokemon {

    private Random sort = new Random();

    public Chikorita() {
        super("Chikorita", "Grama", false);
    }

    @Override
    public int atacar() {
        return 45 + sort.nextInt(65);
    }

    @Override
    public int defender() {
        return 1 + sort.nextInt(45);
    }
}
