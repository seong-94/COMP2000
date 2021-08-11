import java.awt.*;

public class Stage {
    
    Grid grid;
    Actor train;
    Actor car;
    Actor boat;

    public Stage(){
        grid = new Grid();
        train = new Train(grid.cells[0][0]);
        car = new Car(grid.cells[0][19]);
        boat = new Boat(grid.cells[14][0]);
    }
    

    public void paint(Graphics g, Point mousePos){
        grid.paint(g, mousePos);
        train.paint(g);
        car.paint(g);
        boat.paint(g);
    }
     
    
}
