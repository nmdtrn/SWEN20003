import bagel.util.Point;
import bagel.util.Rectangle;

public abstract class Obstacle {
    protected Point position;

    public Obstacle(int startX, int startY) {
        this.position = new Point(startX, startY);
    };

    public abstract void update();
    public abstract Rectangle getBoundingBox();
}
