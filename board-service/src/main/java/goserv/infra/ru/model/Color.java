package goserv.infra.ru.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
@AllArgsConstructor
@Getter
public enum Color {
    WHITE('w'),
    BLACK('b');

    private char color;

    public static Color getByChar(char color){
        for (Color c :Color.values()){
            if (c.getColor() == color){
                return c;
            }
        }
        return null;
    }

}
