package goserv.infra.ru.model;

import java.util.List;
import java.util.Map;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public class Board {
    private Map<Color, Integer> grabbedStone;
    private int size = 19;
    private List<Stone> board;
    private List<Stone> history;

    public List<Stone> getBoard() {
        return board;
    }

    public void setBoard(List<Stone> board) {
        this.board = board;
    }

    public List<Stone> getHistory() {
        return history;
    }

    public void setHistory(List<Stone> history) {
        this.history = history;
    }

    public Map<Color, Integer> getGrabbedStone() {
        return grabbedStone;
    }

    public void setGrabbedStone(Map<Color, Integer> grabbedStone) {
        this.grabbedStone = grabbedStone;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
