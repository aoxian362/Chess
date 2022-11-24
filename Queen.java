public class Queen extends Piece{
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
   
   
    x = xCord+1;
    y = yCord;
   
   while(x<=7){
      if(board[x][y].PieceID() ==0)
         availableMoves[x][y] = true;
      else{
      availableMoves[x][y] = board[x][y].isWhite != isWhite;
      break;
      }
      x++;      
   }
   x = xCord;
   y = yCord+1;
   
   while(y <=7){
      if(board[x][y].PieceID() ==0)
         availableMoves[x][y] = true;
      else{
      availableMoves[x][y] = board[x][y].isWhite != isWhite;
      break;
      }
      y++;
      
   }
   
   x = xCord-1;
   y = yCord;
   
   while(x >=0){
      if(board[x][y].PieceID() ==0)
         availableMoves[x][y] = true;
      else{
      availableMoves[x][y] = board[x][y].isWhite != isWhite;
      break;
      } 
      x--;  
   }
   
   x = xCord;
   y = yCord-1;
   
   while(y >=0){
      if(board[x][y].PieceID() ==0)
         availableMoves[x][y] = true;
      else{
      availableMoves[x][y] = board[x][y].isWhite != isWhite;
      break;
      }    
   
   y--;
   }

   
            
            return availableMoves;
   }
   
   public Queen(boolean color, int x, int y){
   isWhite = color;
   
   if(isWhite)
      direction = 1;
   else
      direction = -1;  
   
   xCord = x;
   yCord = y; 
   }
   
   public int PieceValue(){
      return 9;
   }
   public int PieceID(){
      return 5;
   }
   public String PieceImage(){
      if(isWhite)
         return "whiteQueen.png";   
      else
         return "blackQueen.png";   
   }

}