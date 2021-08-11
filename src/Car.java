import java.awt.*;

public class Car  implements Actor{
    
    Cell pos;    
    Color color = new Color(105, 0 , 150);
    public Car(Cell pos){
        this.pos = pos;

    }
    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(pos.x+5, pos.y+5, pos.width-10, pos.height-10);
        
    }

}