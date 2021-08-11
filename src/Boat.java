import java.awt.*;

public class Boat  implements Actor{
    
    Cell pos;    

    public Boat(Cell pos){
        this.pos = pos;

    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(pos.x+5, pos.y+5, pos.width-10, pos.height-10);
            }

}
