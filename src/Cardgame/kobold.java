package Cardgame;

public class kobold extends Creature {
    public kobold(){
        name = "kobold";
        stats[0] = 7;
        stats[1] = 15;
        stats[2] = 9;
        stats[3] = 8;
        stats[4] = 7;
        stats[5] = 8;
        ac = 12;
        hp = roll(2,6,-2);
        proficiencyBonus = 0;
        attackstat = 1;
        movement = 30;
        dmgDiceCount = 1;
        dmgDice = 4;
        combatBonus = ((int)(Math.floor(stats[attackstat]/2)- 5 + proficiencyBonus));
    }
}
