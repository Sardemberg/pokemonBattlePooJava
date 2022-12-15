package pokemon_batle.pokemons;

import java.util.Random;
import pokemon_batle.Pokemon;

public class Cubone extends Pokemon {

    private Random sort;

    public Cubone() {
        super("Cubone", "Terra", false);
    }

    @Override
    public int atacar(String efetivity) {
        return get_efetivity_attack(efetivity);
    }

    @Override
    public int defender(String efetivity) {
        return get_efetivity_defense(efetivity);
    }

    private int get_efetivity_attack(String efetivity) {
        switch (efetivity) {
            case "critical": {
                return sort.nextInt(60);
            }
            case "normal": {
                return sort.nextInt(40);
            }
            case "non_efective": {
                return sort.nextInt(20);
            }
        }

        return 0;
    }

    private int get_efetivity_defense(String efetivity) {
        switch (efetivity) {
            case "critical": {
                return sort.nextInt(20);
            }
            case "normal": {
                return sort.nextInt(25);
            }
            case "non_efective": {
                return sort.nextInt(30);
            }
        }

        return 0;
    }
}
