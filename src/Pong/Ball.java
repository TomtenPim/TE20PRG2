package Pong;

public class Ball {
    int x;
    int y;
    int vx;
    int vy;

    public Ball (int x, int y) {
        this.x = x;
        this.y = y;
        this.vx = 1;
        this.vy = 1;
    }
    public int getX () {return x;}
    public int getY () {return y;}
    public void move () {x += vx; y += vy;}
    public void bounce (Paddle p) {vx *= -1;}
    public void bounce () {vy *= -1;}
}
