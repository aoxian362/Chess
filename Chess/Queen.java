public class Queen extends Piece{
   
   boolean[][] availableMoves;
   
   public Queen(int x, int y,boolean c){
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
            availableMoves[i][l] = false;   
       }
    
    
          for(x = xCord+1; x<8; x++){
         if(board[x][y] == 0 || board[x][y] == 8 || board[x][y] == -8)
            availableMoves[x][y] = true; 
         else{
            availableMoves[x][y] = (board[x][y] > 0 == isWhite); 
            break;
      }
         
      }  
      x = xCord;
      y = yCord;
      
      for(x = xCord-1; x>=0; x--){
      if(board[x][y] == 0 || board[x][y] == 8 || board[x][y] == -8)
      availableMoves[x][y] = true; 
      else{
      availableMoves[x][y] = (board[x][y] > 0 == isWhite); 
      break;
      }
      
      }
      
      x = xCord;
      y = yCord;
      
      for(y = yCord+1; y<8; y++){
      if(board[x][y] == 0 || board[x][y] == 8 || board[x][y] == -8)
      availableMoves[x][y] = true; 
      else{
      availableMoves[x][y] = (board[x][y] > 0 == isWhite); 
      
      break;
      }
      
      }

      
      for(y = yCord-1; y>=0; y--){
      
         if(board[x][y] == 0 || board[x][y] == 8 || board[x][y] == -8)
            availableMoves[x][y] = true; 
         else{
            availableMoves[x][y] = (board[x][y] > 0 == isWhite); 
            break;
         }
      
      }         
       
      x = xCord-1;
      y = yCord-1;
          while(!(x <0 || x>=8 || y <0 || y >=8)){
         
            if(board[x][y] ==0 || board[x][y] == 8 || board[x][y] == -8)
               availableMoves[x][y] = true;
            else{
            
            availableMoves[x][y] = (board[x][y]>0) == isWhite;
 
            break;            
            }
            x--;
            y--;
       }
       
       x = xCord+1;
       y = yCord-1;
       
       while(!(x <0 || x>=8 || y <0 || y >=8)){
            
            if(board[x][y] ==0 || board[x][y] == 8 || board[x][y] == -8)
               availableMoves[x][y] = true;
            else{
            
            availableMoves[x][y] = (board[x][y] > 0) == isWhite;
 
            break;            
            }
            x++;
            y--;
       }
       
       x = xCord+1;
       y = yCord+1;
       while(!(x <0 || x>=8 || y <0 || y >=8)){
         
            if(board[x][y] ==0 || board[x][y] == 8 || board[x][y] == -8)
               availableMoves[x][y] = true;
            else{
            
            availableMoves[x][y] = (board[x][y]>0) == isWhite;
 
            break;            
            }
            x++;
            y++;
       }
       x = xCord-1;
       y = yCord+1;
       
       while(!(x <0 || x>=8 || y <0 || y >=8)){
         
            if(board[x][y] ==0 || board[x][y] == 8 || board[x][y] == -8)
               availableMoves[x][y] = true;
            else{
            
            availableMoves[x][y] = (board[x][y]>0) == isWhite;
 
            break;            
            }
            x--;
            y++;
       }    
    
             
       
       return availableMoves;
   }
}