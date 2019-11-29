package Entities;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Status extends JLabel {

    private static Status status = new Status();

    private Status() {

        super.setText("X`s playing now");
        setBorder(new LineBorder(Color.YELLOW, 1));
    }

    public static Status getStatus() {
        return status;
    }
}
