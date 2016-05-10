import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.BorderLayout;

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private int WIDTH = 533;
    private int LENGTH = 597;
    private Chess_board board;

    /**
     * Default constructor for objects of class Play
     */
    public Play()
    {
        super("CHESS");
        board = new Chess_board();
    }


}
