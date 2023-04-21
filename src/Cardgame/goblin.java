package Cardgame;

public class goblin extends Creature{

    public goblin(){
        name = "goblin";
        stats[1] = 8;
        stats[2] = 14;
        stats[3] = 10;
        stats[4] = 10;
        stats[5] = 8;
        stats[6] = 8;
        ac = 15;
        hp = 7;
        Math.random();
    }
}
