package goserv.infra.ru.model;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public class Stone {

    public Stone(int x, int y, Color color){
        this.position = new Position(x, y);
        this.color = color;
        this.breatheCount = 0;
    }

    private final Position position;
    private final Color color;
    private int breatheCount;

    public Position getPosition() {
        return position;
    }

    public Color getColor() {
        return color;
    }

    public int getBreatheCount() {
        return breatheCount;
    }

    public void setBreatheCount(int breatheCount) {
        this.breatheCount = breatheCount;
    }
}
