      
   public class king extends Piece{
      boolean[][] availableMoves;
      
      public king(int x, int y, boolean c){
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
        
        return availableMoves;
        
        /*
        
        for(int i=-1; i<2; i++)
           for(int l=-1; l<2; l++){
               if(x+i >= 8 || x+i < 0 || y+l >=8 || y+l <0)
               continue;
               
               if(board[x+i][y+l] == 0)
               availableMoves[x+i][y+l] == true;
               
               if(isBlack){
                  if(board[x+i][y+l] > 0)
                     availableMoves[x+i][y+l] == false;
                  
                  if(board[x+i][y+l] <0) //need to check for check later, going to be a fucking pain in the ass
                     availableMoves[x+i][y+l] == true;
               }
               else{
                  if(board[x+i][y+l] > 0) //need to check for check later, going to be a fucking pain in the ass
                     availableMoves[x+i][y+l] == true;
                  
                  if(board[x+i][y+l] <0)
                     availableMoves[x+i][y+l] == false;               
                  
              
               }
                
         }
         */
        
      }
      
      }
      
      