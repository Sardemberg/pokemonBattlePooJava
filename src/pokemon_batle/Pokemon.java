
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon_batle;

/**
 *
 * @author Sardemberg
 */
public abstract class Pokemon {

    private int life = 100;
    private String name;
    private String type;
    private boolean has_mega_evolution = false;

    public Pokemon(String name, String type, boolean has_mega_evolution) {
        this.name = name;
        this.type = type;
        this.has_mega_evolution = has_mega_evolution;
    }

    public abstract int atacar(String efetivity);

    public abstract int defender(String efetivity);

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAlive() {
        if (this.life > 0) {
            return true;
        }
        return false;
    }
}
