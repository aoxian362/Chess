public class Pawn extends Piece{
   
   boolean[][] availableMoves;
   
   public Pawn(int x, int y,boolean c){
         xCord = x;
         yCord = y;
         isWhite = c;
         availableMoves = new boolean[8][8];
 
   }
   
      public boolean[][] canMove(int[][] board){
        
      int x = xCord;
      int y = yCord; 
        
      for(int i=0; i<8; i++)
         for(int l=0; l<8; l++){
            availableMoves[i][l] = true;   
       }
        
       return availableMoves;
   }
}