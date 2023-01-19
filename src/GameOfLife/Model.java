package GameOfLife;

public class Model{
    int height;
    int width;
    int neighbours;
    boolean alive = true;
    Cell cells[][] = new Cell[width][height];


    public Model(int width, int height){
        Cell cells[][] = new Cell[width][height];
        //Skapar alla celler

        for(int x = 0; x < width; x++){
            for(int y = 0; y < height; y++){
                cells[x][y] = new Cell(false);
            }
        }

        cells[5][5] = new Cell(true);
        cells[7][8] = new Cell(true);
        cells[3][4] = new Cell(true);
    }

    public void update(){

        //Kollar antalet grannar och markerar för bytning utifrån det

        for(int x = 1; x < width-1; x++){
            for(int y = 1; y < height-1; y++){
                int neighbours = 0;

                if(cells[x][y].alive == true){
                    neighbours--;
                }

                //Kollar alla celler runt x,y och räknar antalet levande celler.

                for(int x1 = -1; x1 < 2; x1++){
                    for(int y1 = -1; y1 < 2; y1++){
                        if(cells[x+x1][y+x1].getAlive() == true) {
                            neighbours++;
                        }
                    }
                }

                cells[x][y].setWillDie(false);
                cells[x][y].setWillLive(false);

                if(neighbours != 2 || neighbours != 3)
                cells[x][y].setWillDie(true);

                if(neighbours == 3 && cells[x][y].getAlive() == false)
                    cells[x][y].setWillLive(true);
            }
        }

        //Byter utifrån markering

        for(int x = 1; x < width; x++){
            for(int y = 1; y < height; y++){
                if (cells[x][y].getWillDie() == true){
                    cells[x][y].setDead();
                }
                if (cells[x][y].getWillLive() == true){
                    cells[x][y].setAlive();
                }
            }
        }

    }

    public Shape[] getShapes(){
        Point[] points = new Point[width*height];

        for(int x = 1; x < width-1; x++){
            for(int y = 1; y < height-1; y++) {
                if (cells[x][y].alive == true) {
                    points[x * (y * width-2)] = new Point(x, y);
                }
            }
        }
        return (Shape[])points;
    }
}
