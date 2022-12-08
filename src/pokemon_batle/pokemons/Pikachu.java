/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon_batle.pokemons;

import java.util.Random;
import java.util.Dictionary;
import java.util.Hashtable;
import pokemon_batle.Pokemon;

/**
 *
 * @author Aluno
 */
public class Pikachu extends Pokemon {
    private Random sort;
    


    @Override
    public int atacar(String efetivity) {
        return get_efetivity_attack(efetivity);
    }

    @Override
    public int defender() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Private methods
    private int get_efetivity_attack(String efetivity) {
        switch (efetivity) {
            case "critical" -> {
                return sort.nextInt(60);
            }
            case "normal" -> {
                return sort.nextInt(40);
            }
            case "non_efective" -> {
                return sort.nextInt(20);
            }
        }
        
        return 0;
    }

}
