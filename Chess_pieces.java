import java.awt.Point;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Image;


import java.awt.image.BufferedImage;
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
    Image pic;
    Point[][] location;
    



    /**
     * Default constructor for objects of class Chess_pieces
     */
    public Chess_pieces(String side,String type,String filename,Chess_pieces[][] array, int coL, int roW,Point[][] location)
    {
        this.side = side;
        this.type = type;
        this.filename = filename;
        this.array = array;
        this.coL = coL;
        this.roW = roW;
        this.location = location;
        
        try
        {
            pic = ImageIO.read(new File(filename));
        }
        catch(IOException e){}
        
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
     * draw it self
     */
    public void draw(Graphics2D g2)
    {
        g2.drawImage(pic,(int)location[roW][coL].getX(),  (int)location[roW][coL].getY()  , null);
    }
    
    
    
    
    public void setArray(Chess_pieces[][] array)
    {
        this.array = array;
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
        this.array[row][col] = this.array[roW][coL];
        this.array[roW][coL] = null;
        roW = row;
        coL = col;
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
    
    public void setLocation(Point[][] location)
    {
        this.location = location;
    }
    
    public boolean isInside(Point point)
    {
        Rectangle rect = new Rectangle((int)location[roW][coL].getX(),(int)location[roW][coL].getY(),40,40);
        
        if(rect.contains(point.getX(),point.getY()))
        {
            return true;
        }
        
        return false;
    }
    
    
    




}
