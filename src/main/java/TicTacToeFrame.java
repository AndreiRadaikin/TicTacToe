import Entities.Board;
import Entities.Status;

import javax.swing.*;
import java.awt.*;

public class TicTacToeFrame extends JFrame {

    private static TicTacToeFrame frame = new TicTacToeFrame();

    private char whoseTurn = 'X';

    private Board board = Board.getBoard();

    private Status status = Status.getStatus();


    private JPanel boardView = new JPanel(new GridLayout(3,3,0,0));

    public TicTacToeFrame(){

        boardView.add(board);

        add(boardView,BorderLayout.CENTER);

        add(status,BorderLayout.SOUTH);


    }

    public static TicTacToeFrame getFrame() {
        return frame;
    }
}
