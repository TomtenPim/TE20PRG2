package GameOfLife;

import java.util.ArrayList;

public class Model{
    int height;
    int width;
    int neighbours;
    Cell cells[][];

    public Model(int width, int height){
        this.width = width;
        this.height = height;

        this.cells = new Cell[this.width][this.height];
        //Skapar alla celler

        for(int x = 0; x < this.width; x++){
            for(int y = 0; y < this.height; y++){
                cells[x][y] = new Cell(false);
                cells[x][y].setWillDie(false);
                cells[x][y].setWillLive(false);
            }
        }

        cells[7][8] = new Cell(true);
        cells[8][9] = new Cell(true);
        cells[9][7] = new Cell(true);
        cells[9][8] = new Cell(true);
        cells[9][9] = new Cell(true);
    }

    public void update(){

        //Kollar antalet grannar och markerar för bytning utifrån det

        for(int x = 1; x < width-1; x++){
            for(int y = 1; y < height-1; y++){
                    neighbours = 0;

                //Kollar alla celler runt x,y och räknar antalet levande celler.

                for(int x1 = -1; x1 < 2; x1++){
                    for(int y1 = -1; y1 < 2; y1++){
                        if(cells[x+x1][y+y1].getAlive() == true) {
                            neighbours++;
                        }
                    }
                }

                //Kollar om den egna cellen x,y lever och räknar bort den om den gör det.

                if(cells[x][y].getAlive() == true){
                    neighbours--;
                }

                //Garanterar att saker inte kommer ihåg att de flippas och råkar göra det extra gånger

                cells[x][y].setWillDie(false);
                cells[x][y].setWillLive(false);

                //Reglerna för Game of Life: börja lev om du har 3 grannar, fortsätt om du har 2 eller 3, dö annars.

                if(neighbours == 3 || (neighbours == 2 && cells[x][y].getAlive() == true)) {
                    cells[x][y].setWillLive(true);
                }
                else{
                    cells[x][y].setWillDie(true);
                }
            }
        }

        //Byter tillstånd utifrån markering

        for(int x = 1; x < width; x++){
            for(int y = 1; y < height; y++){

                //Om cellen ska dö, dö.

                if (cells[x][y].getWillDie() == true){
                    cells[x][y].setDead();
                }

                //Om cellen ska leva, börja lev.

                if (cells[x][y].getWillLive() == true){
                    cells[x][y].setAlive();
                }
            }
        }
    }

    public Shape[] getShapes() {

        ArrayList<Point> points = new ArrayList<Point>();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {

                //Kollar om cellen x,y är vid liv

                if (cells[x][y].getAlive() == true) {

                    //Om den är det, rita ut den

                    points.add(new Point(x, y));
                }
            }
        }

        Point[] pixelsToDisplay = new Point[points.size()];
        points.toArray(pixelsToDisplay);

        return (Shape[]) pixelsToDisplay;

    }
}
