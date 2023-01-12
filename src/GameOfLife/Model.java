package GameOfLife;

public class Model{
    int height;
    int width;
    Cell cells[][];


    public Model(int width, int height){
        for(int x = 0; x < width; x++){
            for(int y = 0; y < width; y++){
                Cell cells = new Cell(x,y);
            }
        }
    }

    public void update(){

    }

    public Shape[] getShapes(){
        Point[] points = {new Point(5,5)};
        return (Shape[])points;
    }


}
