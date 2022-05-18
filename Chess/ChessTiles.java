import javax.swing.JButton;

public class ChessTiles extends JButton{
   public int xCord;
   public int yCord;
   public ChessTiles(int x, int y){
   xCord = x;
   yCord = y;
   }
   
   public int getXCord(){
   return xCord;
   }
   public int getYCord(){
   return yCord;
   }

}