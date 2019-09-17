package movingfigure;

/**
 *
 * @author 358721
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
    private Figure figure;
    
    public DrawingBoard(Figure figure) {
        this.figure = figure;
    }
    
    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.figure.draw(graphics);
    }
}