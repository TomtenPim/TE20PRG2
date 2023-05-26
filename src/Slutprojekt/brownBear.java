package Slutprojekt;

public class brownBear extends Creature {

    public brownBear(){
        name = "Brown bear";
        stats[0] = 19;
        stats[1] = 10;
        stats[2] = 16;
        stats[3] = 2;
        stats[4] = 13;
        stats[5] = 7;
        ac = 11;
        hp = roll(4,10,12);
        proficiencyBonus = 1;
        attackstat = 1;
        movement = 30;
        dmgDiceCount = 1;
        dmgDice = 8;
        combatBonus = ((int)(Math.floor(stats[attackstat]/2)- 5 + proficiencyBonus));
    }
}
