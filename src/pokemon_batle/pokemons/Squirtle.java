package pokemon_batle.pokemons;

import java.util.Random;
import pokemon_batle.Pokemon;

public class Squirtle extends Pokemon {

    private Random sort = new Random();

    public Squirtle() {
        super("Squirtle", "Água", false);
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
