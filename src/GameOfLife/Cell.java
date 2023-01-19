package GameOfLife;

public class Cell {

    public boolean alive;
    public boolean willLive;
    public boolean willDie;

    public Cell(boolean alive){
        this.alive = alive;
    }

    public boolean getAlive(){return alive;}
    public boolean getWillLive(){return willLive;}
    public boolean getWillDie(){return willDie;}

    public void setWillLive(boolean willLive){
        this.willLive = willLive;
    }
    public void setWillDie(boolean willDie){
        this.willDie = willDie;
    }

    public void setAlive(){
        this.alive = true;
    }
    public void setDead(){
        this.alive = false;
    }
}
