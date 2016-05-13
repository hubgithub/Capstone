import java.awt.Point;

/**
 * Xiang extends Chess_pieces
 * Red Up = 4
 * Black Down = 5
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Xiang extends Chess_pieces
{


    /**
     * Default constructor for objects of class Xiang
     */
    public Xiang(String side,String type,String filename,Chess_pieces[][] array, int x, int y,Point[][] location)
    {
        super(side,type,filename,array,x,y,location);

    }
    
    
    public boolean valid_move(int col, int row)
    {
        if(col == coL && row == roW)
        {
            return true;
        }
        
        if(side.equals("red"))
        {
            if(row > 4)
            {
                return false;
            }
        }
        else
        {
            if(row < 5)
            {
                return false;
            }
        }
        
        if(Math.abs(roW-row) == 2 && Math.abs(coL - col) == 2)
        {
            if(roW < row)
            {
                if(coL < col)
                {
                    if(array[roW+1][coL+1] != null)
                    {
                        return false;
                    }
                }
                else
                {
                    if(array[roW+1][coL - 1] != null)
                    {
                        return false;
                    }
                }
            }
            else
            {
                if(coL < col)
                {
                    if(array[roW-1][coL+1] != null)
                    {
                        return false;
                    }
                }
                else
                {
                    if(array[roW-1][coL - 1] != null)
                    {
                        return false;
                    }
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
        if(col == coL && row == roW)
        {
            return false;
        }        
        return valid_move(col,row);
    }


}
