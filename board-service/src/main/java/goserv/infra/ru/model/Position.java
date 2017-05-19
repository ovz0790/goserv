package goserv.infra.ru.model;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public class Position {
    private final int x;
    private final int y;
    public Position(int x, int y){
        this.x =x;
        this.y =y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
