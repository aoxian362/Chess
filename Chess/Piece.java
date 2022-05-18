public abstract class Piece{

   public int xCord = -1;
   public int yCord =-1;
   public int xDiff;
   public int yDiff;
   public boolean isWhite = false; 
   boolean availbleMoves[][];

   
   public abstract boolean[][] canMove(int[][] board);
   public void move(int x, int y){
   xCord = x;
   yCord = y;
   }
   
   public void setCords(int x, int y){
   xCord = x;
   yCord = y;
   }
   
   
}