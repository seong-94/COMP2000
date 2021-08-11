import java.awt.*;

public class Train implements Actor {
    
    Cell pos;

    public Train(Cell pos){
        this.pos = pos;
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(pos.x+5, pos.y+5, pos.width-10, pos.height-10);
     
    }
    
}
