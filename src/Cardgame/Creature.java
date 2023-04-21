package Cardgame;

public class Creature {
    public String name;
    public int[] stats = new int[6];
    public int attackstat;
    public int ac;
    public int hp;
    public int movement;
    public int[] proficiency;
    public int proficiencyBonus;

    public String attack(Creature foe){
        if ((Math.floor(stats[attackstat]/2-5+proficiencyBonus)) >foe.ac){

            int dmg = damage(foe);

            if (dmg > foe.hp){
                return this.name + " dräpte " + foe.name;
            }
            else{
                return this.name + " åsamkade " + dmg + " skada på " + foe.name;
            }
        }
        else {
            return this.name + " missade " + foe.name;
        }
    }

    public int damage(Creature foe){
        return;
    }
}

