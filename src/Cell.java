import java.awt.Color;
import java.awt.Graphics;

public class Cell {
    //fields
    int x;
    int y;

    //condstructor
    public Cell(int x,int y){ // x,y where this cell is
        this.x = x;
        this.y = y;
    }

    //methods
    void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x, y, 35, 35);
        g.setColor(Color.black);
        g.drawRect(x, y, 35, 35);
        

    }
}
