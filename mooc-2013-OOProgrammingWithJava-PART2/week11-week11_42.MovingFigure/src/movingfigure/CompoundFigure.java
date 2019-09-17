package movingfigure;

/**
 *
 * @author 358721
 */
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CompoundFigure extends Figure{
    private List<Figure> figures ;

    public CompoundFigure() {
        super(0, 0);
        this.figures = new ArrayList<Figure>();
    }

    public void add(Figure figure) {
        this.figures.add(figure);
    }

    @Override
    public void draw(Graphics graphics) {
        for(Figure f: this.figures) {
            f.draw(graphics);
        }
    }
    
    public void move(int dx, int dy) {
        for(Figure figure: this.figures) {
            figure.move(dx, dy);
        }
    }
}
