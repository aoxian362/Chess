public class King extends Piece{
   public boolean[][] canMove(Piece[][] board){
   
   boolean[][] availableMoves = new boolean[8][8];
   
   int x = xCord;
   int y = yCord;
  
      if(x-1>=0){
         if(board[x-1][y].PieceID() ==0)
            availableMoves[x-1][y] = true;
         else
            availableMoves[x-1][y] = board[x-1][y].isWhite != isWhite;
         
      }
      
      if(x+1<=7){
         if(board[x+1][y].PieceID() ==0)
            availableMoves[x+1][y] = true;
         else
            availableMoves[x+1][y] = board[x+1][y].isWhite != isWhite;
      }   
   if(y+1<=7){
   
      if(board[x][y+1].PieceID() ==0)
         availableMoves[x][y+1] = true;
      else
         availableMoves[x][y+1] = board[x][y+1].isWhite != isWhite;
   
      if(x-1>=0){
         if(board[x-1][y+1].PieceID() ==0)
            availableMoves[x-1][y+1] = true;
         else
            availableMoves[x-1][y+1] = board[x-1][y+1].isWhite != isWhite;
         
      }
      
      if(x+1<=7){
         if(board[x+1][y+1].PieceID() ==0)
            availableMoves[x+1][y+1] = true;
         else
            availableMoves[x+1][y+1] = board[x+1][y+1].isWhite != isWhite;
      }
      
   }
   
   if(y-1 >= 0){
      
      if(board[x][y-1].PieceID() ==0)
         availableMoves[x][y-1] = true;
      else
         availableMoves[x][y-1] = board[x][y-1].isWhite != isWhite;
      
       if(x-1>=0){
         if(board[x-1][y-1].PieceID() ==0)
            availableMoves[x-1][y-1] = true;
         else
            availableMoves[x-1][y-1] = board[x-1][y-1].isWhite != isWhite;
         
      }
      
      if(x+1<=7){
         if(board[x+1][y-1].PieceID() ==0)
            availableMoves[x+1][y-1] = true;
         else
            availableMoves[x+1][y-1] = board[x+1][y-1].isWhite != isWhite;
      }     
      
      
   }
   
   
   


            
            return availableMoves;
   }
   
   
   public boolean inCheck(Piece[][] board){
      return inCheck(board,xCord,yCord);
   }
   
   public boolean inCheck(Piece[][] board,int xc,int yc){
      
      boolean isCheck;
      int x = xc+1;
      int y = yc;
      // checking if being attacked by rook or queen
      while(x<=7){
      if(board[x][y].PieceID() !=0){
         if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 4 || board[x][y].PieceID() == 5) )
            return true;
            
      }
      
      x++;
      }
      
      x = xc-1;
      while(x>=0){
      if(board[x][y].PieceID() !=0){
         if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 4 || board[x][y].PieceID() == 5) )
            return true;
      }
      x--;
      }
      x = xc;
      y = yc+1;
      
      while(y <=7){
       if(board[x][y].PieceID() !=0){
         if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 4 || board[x][y].PieceID() == 5) )
            return true;
      }
      y++;     
      }
      
      y = yc-1;

      while( y>=0){
       if(board[x][y].PieceID() !=0){
         if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 4 || board[x][y].PieceID() == 5) )
            return true;
      }
      y--;        
      }
      //checking if being attacked by bishop or queen
      x = xc+1;
      y = yc+1;
      
      while(x<=7 && y <=7){
       if(board[x][y].PieceID() !=0){
         if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 3 || board[x][y].PieceID() == 5) )
            return true;
      }      
      x++;
      y++;
      }
      
      x = xc+1;
      y = yc-1;
      
      while(x<=7 && y >=0){
       if(board[x][y].PieceID() !=0){
         if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 3 || board[x][y].PieceID() == 5) )
            return true;
      }      
      x++;
      y--;
      }      
      
      x = xc-1;
      y = yc+1;
      
      while(x>=0 && y <=7){
       if(board[x][y].PieceID() !=0){
         if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 3 || board[x][y].PieceID() == 5) )
            return true;
      }      
      x--;
      y++;
      }  
      
      x = xc-1;
      y = yc-1;
      
      while(x>=0 && y >=0){
      if(board[x][y].PieceID() !=0){
        if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 3 || board[x][y].PieceID() == 5) )
            return true;
      }      
      x--;
      y--;
      }
      
      // checking if being attacked by knight reee
      
x = xc+2;

   if(xc+2 <=7){
   
      if(yc+1 <=7){
      y = yc+1;
         if(board[x][y].PieceID() !=0){
           if((board[x][y].isWhite != isWhite) &&
            (board[x][y].PieceID() == 2 ))
               return true;
         }       
      }
      if(yc-1 >=0){
      y = yc-1;
         if(board[x][y].PieceID() !=0){
           if((board[x][y].isWhite != isWhite) &&
            (board[x][y].PieceID() == 2) )
               return true;
         }       
      }
      
   
   }     
   if(xc-2 >=0){
   x = xc-2;
      if(yc+1 <=7){
      y = yc+1;
         if(board[x][y].PieceID() !=0){
           if((board[x][y].isWhite != isWhite) &&
            (board[x][y].PieceID() == 2 ))
               return true;
         }       
      }
      if(yc-1 >=0){
      y = yc-1;
         if(board[x][y].PieceID() !=0){
           if((board[x][y].isWhite != isWhite) &&
            (board[x][y].PieceID() == 2) )
               return true;
         }       
      }
      
      
   
   }
   
   if(yc+2 <=7){
   y = yc+2;
   x = xc+1;
   if(x<=7){
      if(board[x][y].PieceID() !=0){
        if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 2) )
            return true;
      }     
   }
   x = xc-1;
   if(x>=0){
      if(board[x][y].PieceID() !=0){
        if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 2) )
            return true;
      }     
   }
   
   }
   if(yc-2 >=0){
   
   y = yc-2;
   x = xc+1;
   if(x<=7){
      if(board[x][y].PieceID() !=0){
        if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 2) )
            return true;
      }     
   }
   x = xc-1;
   if(x>=0){
      if(board[x][y].PieceID() !=0){
        if((board[x][y].isWhite != isWhite) &&
         (board[x][y].PieceID() == 2) )
            return true;
      }     
   }
   }
      
      
      return false;
         
   }
   
   public King(boolean color, int x, int y){
   isWhite = color;
   
   if(isWhite)
      direction = 1;
   else
      direction = -1;
      
   xCord = x;
   yCord = y;
   }
   
   public int PieceValue(){
      return 9000;
   }
   public int PieceID(){
      return 6;
   }
   public String PieceImage(){
      if(isWhite)
         return "whiteKing.png";   
      else
         return "blackKing.png";   
   }
   

}