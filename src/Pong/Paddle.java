package Pong;

public class Paddle {
    private int x;
    private int y;
    private int width = 10;

    public Paddle (int x,int y){
        this.x = x;
        this.y = y;
    }
    public void moveUp () {x--;}
    public void moveDown () {x++;}
    public int getX () {return x;}
    public int getY () {return y;}
    public int gedWidth () {return width;}
}
