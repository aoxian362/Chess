public class Knight extends Piece{
   public boolean[][] canMove(Piece[][] board){
   
   boolean[][] availableMoves = new boolean[8][8];
     
     
      if(xCord+2 <=7 && yCord+1<=7){
         availableMoves[xCord+2][yCord+1] = true;
         }
      if(xCord+2 <=7 && yCord-1>=0){
         if(board[xCord+2][yCord-1].PieceID() == 0)
            availableMoves[xCord+2][yCord-1] = true;
         else
         availableMoves[xCord+2][yCord-1] = board[xCord+2][yCord-1].isWhite != isWhite;
         }
      if(xCord-2 >=0 && yCord+1<=7){
         if(board[xCord-2][yCord+1].PieceID() ==0)
         availableMoves[xCord-2][yCord+1] = true;
         else
         availableMoves[xCord-2][yCord+1] = board[xCord-2][yCord+1].isWhite != isWhite;
         }
      if(xCord-2>=0 && yCord-1>=0){
         if(board[xCord-2][yCord-1].PieceID() ==0)
            availableMoves[xCord-2][yCord-1] = true;
         else
            availableMoves[xCord-2][yCord-1] = board[xCord-2][yCord-1].isWhite != isWhite;
         }
         
      if(yCord+2 <=7 && xCord+1<=7){
         if(board[xCord+1][yCord+2].PieceID() ==0)
            availableMoves[xCord+1][yCord+2] = true;
         else
            availableMoves[xCord+1][yCord+2] = board[xCord+1][yCord+2].isWhite != isWhite;
         }
      if(yCord+2 <=7 && xCord-1>=0){
         if(board[xCord-1][yCord+2].PieceID() ==0)
            availableMoves[xCord-1][yCord+2] = true;
         else
            availableMoves[xCord-1][yCord+2] = board[xCord-1][yCord+2].isWhite != isWhite;
         }
      if(yCord-2 >=0 && xCord+1<=7){
         if(board[xCord+1][yCord-2].PieceID() ==0)
            availableMoves[xCord+1][yCord-2] = true;
         else
            availableMoves[xCord+1][yCord-2] = board[xCord+1][yCord-2].isWhite != isWhite;
         }
      if(yCord-2 >=0 && xCord-1>=0){
         if(board[xCord-1][yCord-2].PieceID() ==0)
            availableMoves[xCord-1][yCord-2] = true;
         else
            availableMoves[xCord-1][yCord-2] = board[xCord-1][yCord-2].isWhite != isWhite;
         }
      
      
            return availableMoves;
   }
   
   public Knight(boolean color, int x, int y){
   isWhite = color;

   if(isWhite)
      direction = 1;
   else
      direction = -1;
      
   xCord = x;
   yCord = y;   
   }
   
   public int PieceValue(){
      return 3;
   }
   public int PieceID(){
      return 2;
   }
   public String PieceImage(){
      if(isWhite)
         return "whiteKnight.png";   
      else
         return "blackKnight.png";   
   }

}