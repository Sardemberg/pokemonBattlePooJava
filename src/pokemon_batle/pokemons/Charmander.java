package pokemon_batle.pokemons;

import java.util.Random;
import pokemon_batle.Pokemon;
import pokemon_battle.mega_evolutions.EvolutionY;


public class Charmander extends Pokemon implements EvolutionY {
    private Random sort = new Random();
    
    public Charmander(){
        super("Charmander", "Fogo", true);
    }

    @Override
    public int atacar() {
        return this.reforce_attack() + 45 + sort.nextInt(65);
    }

    @Override
    public int defender() {
        return this.reforce_defender() + 1 + sort.nextInt(45);
    }

    @Override
    public int reforce_attack() {
        int chance = 1 + sort.nextInt(4);
        
        if (chance == 4){
            System.out.println("O pokemon " + this.getName() + " teve reforço de 25 no ataque!"); 
            return 25;
        }
        
        return 0;
    }

    @Override
    public int reforce_defender() {
        int chance = 1 + sort.nextInt(4);
        
        if (chance == 4){
            System.out.println("O pokemon " + this.getName() + " teve reforço de 25 na defesa!"); 
            return 25;
        }
        
        return 0;
    }
}
