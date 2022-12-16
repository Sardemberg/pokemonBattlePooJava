package pokemon_batle.pokemons;

import java.util.Random;
import pokemon_batle.Pokemon;
import pokemon_battle.mega_evolutions.EvolutionX;

public class Pikachu extends Pokemon implements EvolutionX {

    private Random sort = new Random();

    public Pikachu() {
        super("Pikachu", "Elétrico", true);
    }

    @Override
    public void setDano(int dano) {
        int vida_final = this.getLife() - dano;

        if (vida_final <= 0) {
            boolean reviveu = this.revive();
            
            if (reviveu) {
                return;
            }
        }

        this.setLife(vida_final);
        System.out.println("O pokemon " + this.getName() + " Sofreu " + dano + " de dano");
    }

    @Override
    public int atacar() {
        return 45 + sort.nextInt(65);
    }

    @Override
    public int defender() {
        this.heal();
        return 1 + sort.nextInt(45);
    }

    @Override
    public void heal() {
        int chance = 1 + sort.nextInt(4);

        if (chance == 4) {
            this.setLife(this.getLife() + 50);
            this.anuncia_evolution();
            System.out.println("O pokemon " + this.getName() + " curou 50 de vida");
        }
    }

    @Override
    public boolean revive() {
        int chance = 1 + sort.nextInt(10);

        if (chance == 10) {
            this.setLife(100);
            this.anuncia_evolution();
            System.out.println("O pokemon " + this.getName() + " morreu, mas reviveu");
            return true;
        }
        
        return false;
    }

    @Override
    public void anuncia_evolution() {
        System.out.println("O pokemon " + this.getName() + " megaevoluiu!");
    }
}
