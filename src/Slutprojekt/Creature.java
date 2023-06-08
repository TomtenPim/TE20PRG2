package Slutprojekt;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class Creature {
    public int team;
    public int[]pos = new int[2];
    public String name;
    public int[] stats = new int[6];
    public int attackstat;
    public int ac;
    public int hp;
    public int movement;
    public int[] proficiency;
    public int proficiencyBonus;
    public int dmgDice;
    public int dmgDiceCount;
    public int multiattack;
    public int combatBonus;
    public boolean crit = false;
    public String critMsg = "";

    /*
    public Creature() {

    }

    public Creature(int[] s ) {
        this.stats = s;
    }
    */
    public void walkTo(Creature foe){

      this.pos[0] += (this.movement/5) * Math.tan((foe.pos[0] - this.pos[0])/(foe.pos[1] - this.pos[1]));
      this.pos[1] += (this.movement/5) * Math.tan((foe.pos[1] - this.pos[1])/(foe.pos[0] - this.pos[0]));
    }

    public void turn(Creature foe){
        walkTo(foe);
        attack(foe);
    }

    public void attack(Creature foe){
        Boolean inRange = false;

        for (int i=-1; i < 2; i++){
            for (int j=-1; j < 2; j++){
                if (this.pos[0]+i  == foe.pos[0] && this.pos[1]+j  == foe.pos[1]){
                    inRange = true;
                }
            }
        }

        if(inRange){

            int hit = roll(1,20,combatBonus);

            if (hit - combatBonus == 20){
                crit = true;
                critMsg = " vilket var en kritisk träff";
            }

            if (hit > foe.ac){

                int dmg = damage();
                if (dmg < 0.5) {
                    dmg = 1;
                }

                foe.hp -= dmg;

                if (foe.hp < 1){
                    System.out.println(this.name + " åsamkade " + dmg + " skada på " + foe.name  + critMsg + " vilket dräpte " + foe.name + "\n \n" + this.name + " vann!");
                }
                else{
                    System.out.println(this.name + " åsamkade " + dmg + " skada på " + foe.name  + critMsg);
                }
            }
            else {
                System.out.println(this.name + " missade " + foe.name);
            }

            critMsg = "";
        }
    }

    public static int roll(int diceCount, int diceType, int bonus){
        int value = 0;
        for(int i=0; i < diceCount; i++){
            value += (int)(Math.random() * diceType) + 1;
        }
        value = value+bonus;
        return value;
    }

    public int damage(){
        int dmg = 0;
        while (crit){
            crit = false;
            dmg += roll(this.dmgDiceCount,this.dmgDice,combatBonus);
        }
        dmg += roll(this.dmgDiceCount,this.dmgDice,combatBonus);
        return dmg;

    }
}

