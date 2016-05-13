import java.awt.Point;

/**
 * extends Chess_pieces
 * 
 * @author (Heng Li) 
 * @version (4-20-2016)
 */
public class Pao extends Chess_pieces
{


    /**
     * Default constructor for objects of class Pao
     */
    public Pao(String side,String type,String filename,Chess_pieces[][] array, int x, int y,Point[][] location)
    {
        super(side,type,filename,array,x,y,location);

    }
    
    public boolean valid_move(int col, int row)
    {
        
        if(col == coL && row == roW)
        {
            return true;
        }    
        
        if(array[row][col] != null)
        {
            return false;
        }        
        
        if(coL != col && row == roW)
        {
            
            for(int i = coL+1; i < col; i++)
            {
                if(array[row][i] != null)
                {
                    return false;
                }
                
            }
        }
        else if(roW != row && coL == col)
        {
            for(int i = roW + 1; i < row; i++)
            {
                if(array[i][col] != null)
                {
                    return false;
                }
            }
            
        }
        else
        {
            return false;
        }
        
        return true;
    }
    
    public boolean check_take(int col, int row)
    {
        
        if(array[row][col] == null)
        {
            return false;
        }        
        
        if(col == coL && row == roW)
        {
            return false;
        }        
        

        int check = 0;
        
        if(array[row][col].getSide().equals(side))
        {
            return false;
        }
        else
        {
            if(coL != col && row == roW)
            {
                if(coL < col)
                {
                    for(int i = coL + 1; i < col; i++)
                    {
                        if(array[row][i] != null)
                        {
                            check++;
                        }
                    }
                }
                else
                {
                    for(int i = coL - 1; i > col; i--)
                    {
                        if(array[row][i] != null)
                        {
                            check++;
                        }
                    }
                }
                
                if(check != 1)
                {
                    return false;
                }

                
            }
            else if(roW != row && coL == col)
            {
                if(roW < row)
                {
                    
                    for(int i = roW + 1; i < row; i++)
                    {
                    
                        if(array[i][col] != null)
                        {
                            check++;
                        }
                    }
                                       
                }
                else
                {
                    for(int i = roW -1; i > row; i--)
                    {
                        if(array[i][col] != null)
                        {
                            check++;
                        }
                    }
                }
            }
                
            if(check != 1)
            {
                return false;
            }                
        }
        
        
        return true;
       
    
            
            
            
        }
        
        

    }

