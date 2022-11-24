



public class emptyPiece extends Piece{
   
   
   
   
   
   
public boolean[][] canMove(Piece[][] board){
   
   boolean[][] availableMoves = new boolean[8][8];
   for(int i=0; i<8; i++)
      for(int l=0; l<8; l++)
         availableMoves[i][l] = false;
         
         return availableMoves;
   }
   
   public int PieceValue(){
   return 0;
   }
   public int PieceID(){
   return 0;
   }
   public String PieceImage(){
   return "";
   }
   

   
}