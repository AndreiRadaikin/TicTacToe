package Entities;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Cell extends JPanel {

    private Token token;

    public Cell() {

        setBorder(new LineBorder(Color.BLACK,1));
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(token == Token.X){
            g.drawLine(10,10, getWidth() - 10, getHeight() - 10);
            g.drawLine(getWidth() - 10, getHeight() - 10, 0,0);
        }
    }
}
