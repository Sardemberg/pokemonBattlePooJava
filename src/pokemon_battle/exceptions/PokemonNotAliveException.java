/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon_battle.exceptions;

/**
 *
 * @author sardemberg
 */
public class PokemonNotAliveException extends Exception {
    public PokemonNotAliveException(String pokemonName){
        super("O pokemon " + pokemonName + " está morto!");
    }
}
