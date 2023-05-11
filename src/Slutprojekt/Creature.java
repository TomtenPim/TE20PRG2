package Slutprojekt;

public class Creature {
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
    public int combatBonus;
    public boolean crit = false;
    public String critMsg = "";

    public void attack(Creature foe){
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

