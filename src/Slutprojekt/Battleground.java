package Slutprojekt;

public class Battleground {
    public static void main(String[] args) {
        goblin g = new goblin();
        kobold k = new kobold();

        if(roll(1,20,(g.stats[1]/2 -5)) > roll(1,20,(k.stats[1]/2-5))){
            g.attack(k);
        }

        int turn = 0;

        while (g.hp > 0 && k.hp > 0){
            k.attack(g);
            if (g.hp > 0 && k.hp > 0) {
                g.attack(k);
            }
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
}

