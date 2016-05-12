import java.awt.Point;
import javax.swing.JPanel;
import java.awt.geom.Point2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.lang.Math;
import javax.swing.JColorChooser;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.awt.image.BufferedImage;
import java.awt.Image;
/**
 * Chess_board, contains all Chess_pieces
 * Red is Up
 * Black is down
 * @author (Heng Li ) 
 * @version (4-21-2016)
 */
public class Chess_board extends JPanel
{

    private Chess_pieces[][] pieces = new Chess_pieces[10][9];
    private Point[][] location = new Point[10][9];
    private Chess_pieces select;
    private boolean black_move;
    private Image pic;
    private Chess_pieces active_piece;

    

    /**
     * set the initial postion of all pieces
     */
    public Chess_board()
    {
       this.setSize(597,533);
       black_move = true;
       
       
        try
        {
            pic = ImageIO.read(new File("./Images/Chessboard.jpg"));
        }
        catch(IOException e){}           
       
        /////////////////////////////////////////////////////////////////////////
       pieces[0][0] = new Jiu("red","Jiu","./Images/Red_Jiu.jpg",new Chess_pieces[10][9],0,0,new Point[10][9]);
       pieces[0][1] = new Ma("red","Ma","./Images/Red_Ma.jpg",new Chess_pieces[10][9],1,0,new Point[10][9]);
       pieces[0][2] = new Xiang("red","Xiang","./Images/Red_Xiang.jpg",new Chess_pieces[10][9],2,0,new Point[10][9]);
       pieces[0][3] = new Shi("red","Shi","./Images/Red_Shi.jpg",new Chess_pieces[10][9],3,0,new Point[10][9]);
       pieces[0][4] = new Shuai("red","Shuai","./Images/Red_Shuai.jpg",new Chess_pieces[10][9],4,0,new Point[10][9]);
       pieces[0][5] = new Shi("red","Shi","./Images/Red_Shi.jpg",new Chess_pieces[10][9],5,0,new Point[10][9]);
       pieces[0][6] = new Xiang("red","Xiang","./Images/Red_Xiang.jpg",new Chess_pieces[10][9],6,0,new Point[10][9]);
       pieces[0][7] = new Ma("red","Ma","./Images/Red_Ma.jpg",new Chess_pieces[10][9],7,0,new Point[10][9]);
       pieces[0][8] = new Jiu("red","Jiu","./Images/Red_Jiu.jpg",new Chess_pieces[10][9],8,0,new Point[10][9]);

       
       pieces[2][1] = new Pao("red","Pao","./Images/Red_Pao.jpg",new Chess_pieces[10][9],1,2,new Point[10][9]);
       pieces[2][7] = new Pao("red","Pao","./Images/Red_Pao.jpg",new Chess_pieces[10][9],7,2,new Point[10][9]);
       
       pieces[3][0] = new Zu("red","Zu","./Images/Red_Zu.jpg",new Chess_pieces[10][9],0,3,new Point[10][9]);
       pieces[3][2] = new Zu("red","Zu","./Images/Red_Zu.jpg",new Chess_pieces[10][9],2,3,new Point[10][9]);
       pieces[3][4] = new Zu("red","Zu","./Images/Red_Zu.jpg",new Chess_pieces[10][9],4,3,new Point[10][9]);
       pieces[3][6] = new Zu("red","Zu","./Images/Red_Zu.jpg",new Chess_pieces[10][9],6,3,new Point[10][9]);
       pieces[3][8] = new Zu("red","Zu","./Images/Red_Zu.jpg",new Chess_pieces[10][9],8,3,new Point[10][9]);
       
       
       //楚河                                                             汉界
       
       pieces[6][0] = new Zu("Black","Zu","./Images/Black_Zu.jpg",new Chess_pieces[10][9],0,6,new Point[10][9]);
       pieces[6][2] = new Zu("Black","Zu","./Images/Black_Zu.jpg",new Chess_pieces[10][9],2,6,new Point[10][9]);
       pieces[6][4] = new Zu("Black","Zu","./Images/Black_Zu.jpg",new Chess_pieces[10][9],4,6,new Point[10][9]);
       pieces[6][6] = new Zu("Black","Zu","./Images/Black_Zu.jpg",new Chess_pieces[10][9],6,6,new Point[10][9]);
       pieces[6][8] = new Zu("Black","Zu","./Images/Black_Zu.jpg",new Chess_pieces[10][9],8,6,new Point[10][9]);
       
       pieces[7][1] = new Pao("Black","Pao","./Images/Black_Pao.jpg",new Chess_pieces[10][9],1,7,new Point[10][9]);
       pieces[7][7] = new Pao("Black","Pao","./Images/Black_Pao.jpg",new Chess_pieces[10][9],7,7,new Point[10][9]);
       
       
       pieces[9][0] = new Jiu("Black","Jiu","./Images/Black_Jiu.jpg",new Chess_pieces[10][9],0,9,new Point[10][9]);
       pieces[9][1] = new Ma("Black","Ma","./Images/Black_Ma.jpg",new Chess_pieces[10][9],1,9,new Point[10][9]);
       pieces[9][2] = new Xiang("Black","Xiang","./Images/Black_Xiang.jpg",new Chess_pieces[10][9],2,9,new Point[10][9]);
       pieces[9][3] = new Shi("Black","Shi","./Images/Black_Shi.jpg",new Chess_pieces[10][9],3,9,new Point[10][9]);
       pieces[9][4] = new Shuai("Black","Shuai","./Images/Black_Shuai.jpg",new Chess_pieces[10][9],4,9,new Point[10][9]);
       pieces[9][5] = new Shi("Black","Shi","./Images/Black_Shi.jpg",new Chess_pieces[10][9],5,9,new Point[10][9]);
       pieces[9][6] = new Xiang("Black","Xiang","./Images/Black_Xiang.jpg",new Chess_pieces[10][9],6,9,new Point[10][9]);
       pieces[9][7] = new Ma("Black","Ma","./Images/Black_Ma.jpg",new Chess_pieces[10][9],7,9,new Point[10][9]);
       pieces[9][8] = new Jiu("Black","Jiu","./Images/Black_Jiu.jpg",new Chess_pieces[10][9],8,9,new Point[10][9]);
       /////////////////////////////////////////////////////////////////////////////
       int row_loc = 10;
       int col_loc = 5;
       
       for(int i = 0; i < pieces.length;i++)
       {
           for(int x = 0; x < pieces[0].length;x++)
           {
               if(pieces[i][x] != null)
               {
                   pieces[i][x].setArray(pieces);
               }
               location[i][x] = new Point(col_loc,row_loc);
               col_loc += 60;
               
           }
           row_loc += 60;
           col_loc = 5;
           
       }
       
       for(int i = 0; i < pieces.length;i++)
       {
           for(int x = 0; x < pieces[0].length;x++)
           {
               if(pieces[i][x] != null)
               {
                   pieces[i][x].setLocation(location);
                }
               
               
            }
       }
       
       Listener listener = new Listener();
       this.addMouseListener(listener);
       
    }
    
    /**
     * Check if game ends
     */
    public boolean gameEnds()
    {
        Chess_pieces[] one = new Chess_pieces[2];
        int index = 0;
        for(int i = 0; i < 10; i++)
        {
            for(int x = 0; x < 9; x++)
            {
                if(pieces[i][x] != null && pieces[i][x].getType().equals("Shuai"))
                {
                    one[index] = pieces[i][x];
                    index++;
                }
            }
        }
        
        if(one[1] == null)
        {
            return true;
        }
        
        return false;
    }
    
    public String whoWon()
    {
        
        String winner = "";
        
        if(gameEnds())
        {
            for(int i = 0; i < 10; i++)
            {
                for(int x = 0; x < 9; x++)
                {
                    if(pieces[i][x] != null && pieces[i][x].getType().equals("Shuai"))
                    {
                        winner = pieces[i][x].getSide();

                    }
                }
            }
            
            
        }
        else
        {
            winner = "None";
            
        }
        
        return winner;  
        
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(pic,0,0, null);
        
        for(int i = 0; i < pieces.length;i++)
        {
            for(int x = 0; x < pieces[0].length;x++)
            {
                if(pieces[i][x] != null)
                {
                    pieces[i][x].draw(g2);
                }
            }
        }
        
        repaint();
    }
    
    public Chess_pieces[][] getPieces()
    {
        return pieces;
    }
    
    
    public Point[][] getPoints()
    {
        return location;
    }
    
    
    class Listener implements MouseListener
    {
        int time = 0;
        
        
        public void mouseClicked(MouseEvent e){}
        

        
        public void mouseExited(MouseEvent e){}

        
        public void mousePressed(MouseEvent e)
        {
            Point point = new Point(e.getX(),e.getY());
            for(int i = 0; i < pieces.length; i++)
            {
                for(int x = 0; x < pieces[0].length;x++)
                {
                    if(pieces[i][x] != null)
                    {
                        if(pieces[i][x].isInside(point))
                        {
                            active_piece = pieces[i][x];
                        }
                    }
                    
                    
                }
                
                
            }
        
        }
        
        public void mouseReleased(MouseEvent e){}
        
        public void mouseEntered(MouseEvent e){}
        
        public void moseExited(MouseEvent e){}
        
    }
    
    class MotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e)
        {
            
            for(int i = 0; i < pieces.length; i++)
            {
                for(int x = 0; x < pieces[0].length;x++)
                {
                    Rectangle rect = new Rectangle((int)location[i][x].getX(),(int)location[i][x].getY(),(int)location[i][x].getX()+40,(int)location[i][x].getY()+40);
                    
                    if(rect.contains(e.getX(),e.getY()))
                    {

                    }
                    
                
                
                }
            }

            
        }  
        
        public void mouseMoved(MouseEvent e)
        {
       
        }            
    
    }
}



//         public void mouseClicked(MouseEvent e)
//         {
//             time++;
//             
//             if(black_move)
//             {
//                 if(time% 2 != 0)
//                 {
//                     Point point = new Point(e.getX(),e.getY());
//                     
//                     for(int i = 0; i < pieces.length; i++)
//                     {
//                         for(int x = 0; x < pieces[0].length;x++)
//                         {
//                             if(pieces[i][x]!= null && pieces[i][x].isInside(point))
//                             {
//                                 active_pieces = pieces[i][x];
//                                 
//                                 
//                             }
//                         }
//                     }
//                     
//                     
//                 }
//                 else
//                 {
//                     
//                     for(int i = 0; i < pieces.length; i++)
//                     {
//                         for(int x = 0; x < pieces[0].length;x++)
//                         {
//                             
//                             Rectangle rect = new Rectangle((int)location[i][x].getX(),(int)location[i][x].getY(),(int)location[i][x].getX()+40,(int)location[i][x].getY()+40);
//                             
//                             if(rect.contains(e.getX(),e.getY()) )
//                             {
//                                 int row = i;
//                                 int col = x;
//                             
//                                 if(active_pieces.valid_move(col,row) || active_pieces.check_take(col,row))
//                                 {
//                                     active_pieces.move(col,row);
//                         
//                                     black_move = false;
//                                 }
//                                 else
//                                 {
//                                     black_move = true;
//                                 }
//                                 
//                             }
//                             else
//                             {
//                                 black_move = true;
//                             }
//                         }
//                     }
//                     
//                     
//                     
//                 }
//             }
//             else
//             {
//                 if(time%2 != 0)
//                 {
//                     Point point = new Point(e.getX(),e.getY());
//                     
//                     for(int i = 0; i < pieces.length; i++)
//                     {
//                         for(int x = 0; x < pieces[0].length;x++)
//                         {
//                             if(pieces[i][x]!=null && pieces[i][x].isInside(point))
//                             {
//                                 active_pieces = pieces[i][x];
//                             }
//                         }
//                     }
//                     
//                     
//                 }
//                 else
//                 {
//                     
//                     for(int i = 0; i < pieces.length; i++)
//                     {
//                         for(int x = 0; x < pieces[0].length;x++)
//                         {
//                             
//                             Rectangle rect = new Rectangle((int)location[i][x].getX(),(int)location[i][x].getY(),(int)location[i][x].getX()+40,(int)location[i][x].getY()+40);
//                             
//                             if(rect.contains(e.getX(),e.getY()) )
//                             {
//                                 int row = i;
//                                 int col = x;
//                             
//                                 if(active_pieces.valid_move(col,row) || active_pieces.check_take(col,row))
//                                 {
//                                     active_pieces.move(col,row);
//                         
//                                     black_move = false;
//                                 }
//                                 else
//                                 {
//                                     black_move = true;
//                                 }
//                                 
//                             }
//                             else
//                             {
//                                 black_move = true;
//                             }
//                         }
//                     }
//                     
//                     
//                 }                
//                 
//                 
//             }
//             
//             repaint();
//         }