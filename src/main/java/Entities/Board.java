package Entities;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Board extends  JPanel{

    //singlton instance
    private static Board board;

    private Cell[][] boardArray = new Cell[3][3];

    //private constructor for singlton
    private Board() {

        setBoard();
        setBorder(new LineBorder(Color.RED,1));
    }

    private JPanel setBoard(){

        JPanel temp = new JPanel(new GridLayout(3,3,0,0));

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                temp.add(boardArray[i][j] = new Cell());
            }
        }

        return temp;
    }

    public static Board getBoard() {
        return board;
    }

    public boolean isFull(){

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                if (boardArray[i][j].getToken() == Token.EMPTY) return false;
            }
        }

        return true;
    }

    public boolean playerWon(Token token){

        for (int i = 0; i < boardArray.length; i++){

            if (boardArray[0][i].getToken() == token
                    && boardArray[1][i].getToken() == token
                    && boardArray[2][i].getToken() == token) return true;
            if (boardArray[i][0].getToken() == token
                    && boardArray[i][1].getToken() == token
                    && boardArray[i][2].getToken() == token) return true;
            if (boardArray[i][i].getToken() == token
                    && boardArray[i][i].getToken() == token
                    && boardArray[i][i].getToken() == token) return true;
            if (boardArray[i][boardArray.length - i].getToken() == token
                    && boardArray[i][boardArray.length - i].getToken() == token
                    && boardArray[i][boardArray.length - i].getToken() == token) return true;
        }
        return false;
    }
}
