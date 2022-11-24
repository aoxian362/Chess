public abstract class Piece{

   public int xCord = -1;
   public int yCord =-1;
   public int xDiff;
   public int yDiff;
   public boolean isWhite = false; 
   boolean availbleMoves[][];
   boolean hasMoved = false;
   int direction = -1;
   
   
   public abstract boolean[][] canMove(Piece[][] board);
   public void move(int x, int y){
      xCord = x;
      yCord = y;
      hasMoved = true;
   }
   

   
   public void setCords(int x, int y){
   xCord = x;
   yCord = y;
   }
   
   public abstract int PieceValue();
   public abstract int PieceID();
   public abstract String PieceImage();



   
}