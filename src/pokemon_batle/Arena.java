/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon_batle;

import java.util.Random;
import java.util.Scanner;
import pokemon_batle.pokemons.*;
import pokemon_battle.exceptions.PokemonNotAliveException;

/**
 *
 * @author Lui Richard
 */
public class Arena {

    /**
     * @param args the command line arguments
     */
    static Random gerador = new Random();
    static Scanner read = new Scanner(System.in);

    // Pokemons
    static Pokemon pikachu = new Pikachu();
    static Pokemon charmander = new Charmander();
    static Pokemon cubone = new Cubone();
    static Pokemon chikorita = new Chikorita();
    static Pokemon squirtle = new Squirtle();

    public static void main(String[] args) throws PokemonNotAliveException {

        int option = -1;

        while (option != 0) {
            menuEscolhaPokemon();
            option = read.nextInt();
            Pokemon pokemonUsuario = null;
            Pokemon pokemonAdversario = null;

            if (option == 0) {
                break;
            }

            pokemonUsuario = switchPokemon(option, true);

            if (pokemonUsuario == null) {
                continue;
            }

            int optionAdversario = 1 + gerador.nextInt(5);

            pokemonAdversario = switchPokemon(optionAdversario, false);

            while (pokemonAdversario == pokemonUsuario || !pokemonAdversario.isAlive()) {
                optionAdversario = 1 + gerador.nextInt(5);
                pokemonAdversario = switchPokemon(optionAdversario, false);
            }
            
            System.out.println("O pokemon escolhido pelo adversário foi o "+ pokemonAdversario.getName());

            battle(pokemonUsuario, pokemonAdversario);
        }
    }

    private static void menuEscolhaPokemon() {
        String status_pikachu = pikachu.isAlive() ? "" : "(Morto)";
        String status_charmander = charmander.isAlive() ? "" : "(Morto)";
        String status_chikorita = chikorita.isAlive() ? "" : "(Morto)";
        String status_cubone = cubone.isAlive() ? "" : "(Morto)";
        String status_squirtle = squirtle.isAlive() ? "" : "(Morto)";

        System.out.println("Escolha seu pokemon");
        System.out.println("1 - Pikachu " + status_pikachu);
        System.out.println("2 - Charmander " + status_charmander);
        System.out.println("3 - Chikorita " + status_chikorita);
        System.out.println("4 - Cubone " + status_cubone);
        System.out.println("5 - Squirtle " + status_squirtle);
        System.out.println("0 - Sair da aplicação");
    }

    private static Pokemon switchPokemon(int option, boolean user) throws PokemonNotAliveException {
        switch (option) {
            case 1:
                if (user) {
                    System.out.println("O pokemon escolhido foi Pikachu!");
                }
                if (user && !pikachu.isAlive()) {
                    throw new PokemonNotAliveException(pikachu.getName());
                }
                return pikachu;
            case 2:
                if (user) {
                    System.out.println("O pokemon escolhido foi Charmander!");
                }
                if (user && !charmander.isAlive()) {
                    throw new PokemonNotAliveException(charmander.getName());
                }
                return charmander;
            case 3:
                if (user) {
                    System.out.println("O pokemon escolhido foi Chikorita!");
                }
                if (user && !chikorita.isAlive()) {
                    throw new PokemonNotAliveException(chikorita.getName());
                }
                return chikorita;
            case 4:
                if (user) {
                    System.out.println("O pokemon escolhido foi Cubone!");
                }
                if (user && !cubone.isAlive()) {
                    throw new PokemonNotAliveException(cubone.getName());
                }
                return cubone;
            case 5:
                if (user) {
                    System.out.println("O pokemon escolhido foi Squirtle!");
                }
                if (user && !pikachu.isAlive()) {
                    throw new PokemonNotAliveException(squirtle.getName());
                }
                return squirtle;
            default:
                System.out.println("Opção inválida");
                return null;
        }
    }

    private static void battle(Pokemon pokemon_usuario, Pokemon pokemon_adversario) {
        int option = 1 + gerador.nextInt(1);

        while (pokemon_usuario.isAlive() && pokemon_adversario.isAlive()) {
            switch (option) {
                case 1:
                    if (pokemon_usuario.isAlive()) {
                        int result_dano_adversario = pokemon_usuario.atacar() - pokemon_adversario.defender();
                        pokemon_adversario.setDano(result_dano_adversario);
                        option = 2;
                    } else {
                        System.out.println("Erro");
                    }
                    break;
                case 2:
                    if (pokemon_adversario.isAlive()) {
                        int result_dano_usuario = pokemon_adversario.atacar() - pokemon_usuario.defender();
                        pokemon_usuario.setDano(result_dano_usuario);
                        option = 1;
                    } else {
                        System.out.println("Erro");
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        if (pokemon_usuario.isAlive()) {
            System.out.println("Seu pokemon venceu!");
            return;
        }

        System.out.println("Seu pokemon para o pokemon " + pokemon_adversario.getName());
    }

}
