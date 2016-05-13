import java.awt.Point;

/**
 * Write a description of class Shuai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shuai extends Chess_pieces
{


    /**
     * Default constructor for objects of class Shuai
     */
    public Shuai(String side,String type,String filename,Chess_pieces[][] array, int x, int y,Point[][] location)
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
            if( (col >=3 &&col <= 5) && (row <= 2))
            {
                if(Math.abs(col-coL) + Math.abs(row-roW) != 1)
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            if( (col >=3 && col <= 5) && (row >=7 ))
            {
                if(Math.abs(col-coL)+ Math.abs(row-roW) != 1)
                {
                    return false;
                }
            }
            else
            {
                return false;
            }            
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
        
        if(col == coL)
        {
            String[] str = new String[9];
            for(int i = 0; i < str.length;i++)
            {
                if(array[i][col] != null)
                {
                    str[i] = array[i][col].getType()
                }
            }
        }
        return valid_move(col,row);
    }



}
