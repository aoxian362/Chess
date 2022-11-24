public class Bishop extends Piece{
   public boolean[][] canMove(Piece[][] board){
   
   boolean[][] availableMoves = new boolean[8][8];

   int x = xCord+1;
   int y = yCord+1;

   while((x >=0 && x<=7 && y >=0 && y <=7)){
      if(board[x][y].PieceID() ==0 || board[x][y].PieceID() == 8 || board[x][y].PieceID() == -8)
         availableMoves[x][y] = true;
      else{
         availableMoves[x][y] = !board[x][y].isWhite == isWhite;
      break;
      }
      x++;
      y++;
   }
   x = xCord+1;
   y = yCord-1;

   
   while((x >=0 && x<=7 && y >=0 && y <=7)){
      if(board[x][y].PieceID() ==0 || board[x][y].PieceID() == 8 || board[x][y].PieceID() == -8)
         availableMoves[x][y] = true;
      else{
         availableMoves[x][y] = !board[x][y].isWhite == isWhite;
      break;
      }
      x++;
      y--;            
   }
   
   x = xCord-1;
   y = yCord+1;
   
   while((x >=0 && x<=7 && y >=0 && y <=7)){
      if(board[x][y].PieceID() ==0 || board[x][y].PieceID() == 8 || board[x][y].PieceID() == -8)
         availableMoves[x][y] = true;
      else{
         availableMoves[x][y] = !board[x][y].isWhite == isWhite;
      break;
      }
      x--;
      y++;            
   }
   
   x = xCord-1;
   y = yCord-1;            
   
   while((x >=0 && x<=7 && y >=0 && y <=7)){
      if(board[x][y].PieceID() ==0 || board[x][y].PieceID() == 8 || board[x][y].PieceID() == -8)
         availableMoves[x][y] = true;
      else{
         availableMoves[x][y] = !board[x][y].isWhite == isWhite;
      break;
      }
      x--;
      y--;           
   }
            
            return availableMoves;
   }
   
   public Bishop(boolean color ,int x , int y){
   isWhite = color;
   xCord = x;
   yCord = y;

   if(isWhite)
      direction = 1;
   else
      direction = -1;   
   }
   
   public int PieceValue(){
      return 3;
   }
   public int PieceID(){
      return 3;
   }
   public String PieceImage(){
      if(isWhite)
         return "whiteBishop.png";   
      else
         return "blackBishop.png";   
   }

}