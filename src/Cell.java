import java.awt.*;

public class Cell {
    // fields
    int x;
    int y;
    static int size = 35;

    // condstructor
    public Cell(int x, int y) { // x,y where this cell is
        this.x = x;
        this.y = y;
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

    boolean contains(Point pos) {
        if (pos != null) {
            return (x < pos.x && x + size > pos.x && y < pos.y && y + size > pos.y);
        } else {
            return false;
        }
    }
}
