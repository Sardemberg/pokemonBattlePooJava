package pokemon_batle.pokemons;

import java.util.Random;
import pokemon_batle.Pokemon;
import pokemon_battle.mega_evolutions.EvolutionX;

public class Pikachu extends Pokemon implements EvolutionX {
    private Random sort;
    
    public Pikachu(){
        super("Pikachu", "Elétrico", true);
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

    @Override
    public void heal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void revive() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
