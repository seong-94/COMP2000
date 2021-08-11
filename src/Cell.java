import java.awt.*;

public class Cell extends Rectangle { // rect has own field x,y 
    // fields
    static int size = 35;

    // condstructor
    public Cell(int x, int y) { // x,y where this cell is
        super(x,y,size,size);

    }

    // methods
    void paint(Graphics g, Point mousePos) {
        if (contains(mousePos)) {
            g.setColor(Color.gray);
        } else {
            g.setColor(Color.white);
        }
        g.fillRect(x, y, 35, 35);
        g.setColor(Color.black);
        g.drawRect(x, y, 35, 35);

    }


    // do not need in rect becasue rect already have contain Point boolean
    public boolean contains(Point pos) {
        if (pos != null) {
            return super.contains(pos);
        } else {
            return false;
        }
    }
}
