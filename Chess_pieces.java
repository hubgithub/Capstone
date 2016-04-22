import java.awt.Point;

/**
 * Super Class of all Chess pieces
 * 
 * @author (Heng Li) 
 * @version (4-20-2016)
 */
public abstract class Chess_pieces
{
    
    String side;
    Point location;
    int border;
    final int MAX_X = 0;
    final int MAX_Y = 0;


    /**
     * Default constructor for objects of class Chess_pieces
     */
    public Chess_pieces(String side, Point location)
    {
        this.side = side;
        this.location = location;
        if(side.equals("red"))
        {
            border = 40;
        }
        else
        {
            border = 60;
        }
        
        

    }
    
    /**
     * abract class valid move
     * return true if move is valid, false otherwise
     * 
     */
    public abstract boolean valid_move(Point next_loc);
    
    /**
     * set the location to the move
     */
    public void move(Point next_loc)
    {
        this.location = next_loc;
    }
    
    public String getSide()
    {
        return this.side;
    }
    
    public Point getLocation()
    {
        return this.location;
    }
    
    /**
     * draw it self
     */
    public void draw()
    {
    }



}
