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
    int border;
    
    int coL;
    int roW;
    String type;
    String filename;
    Chess_pieces[][] array;
    



    /**
     * Default constructor for objects of class Chess_pieces
     */
    public Chess_pieces(String side,String type,String filename,Chess_pieces[][] array, int coL, int roW)
    {
        this.side = side;
        this.type = type;
        this.filename = filename;
        this.array = array;
        this.coL = coL;
        this.roW = roW;
        
        if(side.equals("red"))
        {
            border = 4;
        }
        else
        {
            border = 5;
        }
        
        

    }
    
    /**
     * abract class valid move
     * return true if move is valid, false otherwise
     * 
     */
    public abstract boolean valid_move(int col, int row);
    
    public abstract boolean check_take(int col, int row);
    
    /**
     * set the location to the move
     */
    public void move(int col, int row)
    {
        this.array[col][row] = this.array[roW][coL];
        this.array[roW][coL] = null;
    }
    
    public int getCol()
    {
        return coL;
    }
    
    public int getRow()
    {
        return roW;
    }
    
    public String getSide()
    {
        return this.side;
    }
    
    
    public String getType()
    {
        return type;
    }
    
    /**
     * draw it self
     */
    public void draw()
    {
    }



}
