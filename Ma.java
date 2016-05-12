import java.awt.Point;

/**
 * Ma class, extends Chess_pieces
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ma extends Chess_pieces
{
    
    

    /**
     * 
     */
    public Ma(String side,String type,String filename,Chess_pieces[][] array, int coL, int roW,Point[][] location)
    {
        super(side,type,filename,array,coL,roW,location);

    }
    
    public boolean valid_move(int col, int row)
    {

        
        if(Math.abs(coL - col) == 2 && Math.abs(roW-row) == 1)
        {
            if(col < coL)
            {
                if(array[roW][coL - 1] != null)
                {
                    return false;
                }
            }
            else
            {
                if(array[roW][coL + 1] != null)
                {
                    return false;
                }
            }
        }
        else if(Math.abs(roW - row) == 2 && Math.abs(coL - col) == 1)
        {
            if(roW < row)
            {
                if(array[roW + 1][coL] != null)
                {
                    return false;
                }
            }
            else
            {
                if(array[roW -1][coL] != null)
                {
                    return false;
                }                
            }
            
        }
        else
        {
            return false;
        }
        
        if(array[row][col] == null)
        {
            return true;
        }
        
        if(array[row][col].getSide().equals(side))
        {
            return false;
        }
        return true;
    }
    
    public boolean check_take(int col, int row)
    {
        return valid_move(col,row);
    }

}
