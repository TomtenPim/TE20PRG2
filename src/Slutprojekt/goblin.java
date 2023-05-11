package Slutprojekt;

public class goblin extends Creature {

    public goblin(){
        name = "goblin";
        stats[0] = 8;
        stats[1] = 14;
        stats[2] = 10;
        stats[3] = 10;
        stats[4] = 8;
        stats[5] = 8;
        ac = 15;
        hp = roll(2,6,0);
        proficiencyBonus = 0;
        attackstat = 1;
        movement = 30;
        dmgDiceCount = 1;
        dmgDice = 6;
        combatBonus = ((int)(Math.floor(stats[attackstat]/2)- 5 + proficiencyBonus));
    }
}
