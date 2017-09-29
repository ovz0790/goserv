package goserv.infra.ru.conf;

import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.model.old.Board;
import goserv.infra.ru.model.Color;
import goserv.infra.ru.model.old.Position;
import goserv.infra.ru.model.old.Stone;
import goserv.infra.ru.proc.BoardAction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by Olga_Zlobina on 5/19/2017.
 */
@Configuration
public class ContextConfig {
    @Bean
    public BoardAction boardAction(){
        return new BoardAction(){
            @Override
            public void cleanBoard(Board board) {

            }

            @Override
            public void makeStep(Stone stone, Board board) throws StepNotAllowedException {

            }

            @Override
            public void goPrevStep(int depth, Board board) {

            }

            @Override
            public void goForwordStep(int depth, Board board) {

            }

            @Override
            public boolean checkStepApply(Board board, Position position, Color color) {
                return false;
            }

            @Override
            public List<Stone> findAndCleanDeadStone(Board board) {
                return null;
            }

            @Override
            public void updateScoring(Board board) {

            }
        };
    }
}
