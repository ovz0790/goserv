package goserv.infra.ru.model;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public class Stone {
    private Position pos;
    private Color color;
    private int breatheCount;

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getBreatheCount() {
        return breatheCount;
    }

    public void setBreatheCount(int breatheCount) {
        this.breatheCount = breatheCount;
    }
}
