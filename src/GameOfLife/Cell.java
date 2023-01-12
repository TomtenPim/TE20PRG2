package GameOfLife;

public class Cell {
    int[][] poss;
    public boolean alive;
    public int neighbours;

    public Cell(int x, int y){
        this.poss =
    }
    public int getNeighbours(){return neighbours;}
    public boolean getAlive(){return alive;}
    public void setAlive(){
        this.alive = true;
    }
    public void setDead(){
        this.alive = false;
    }
}
