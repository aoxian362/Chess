import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;


public class chessListener implements ActionListener{
   public boolean clicked = false;
   public boolean turn = true;
   Piece prevPiece;
   Piece[][] board;
   King whiteKing;
   King blackKing;
   JButton ref;
   int prevXCord= -1;
   int prevYCord= -1;
   ChessGame curr;
   public chessListener(Piece[][] b,King w, King bl, ChessGame c){
   board = b;
   whiteKing = w;
   blackKing = bl;
   curr = c;
   }
   
   
   public void actionPerformed(ActionEvent e){
      boolean[][] availableMove;
      int xCord;
      int yCord;
      
      if(!clicked){
      ref = (JButton)e.getSource();
      
      prevXCord = (int)ref.getClientProperty("column");
      prevYCord = (int)ref.getClientProperty("row");
      if(board[prevXCord][prevYCord].PieceID() ==0)
         return;
      if((board[prevXCord][prevYCord].isWhite != turn))
         return;
      
      clicked = true;
      return;
      }
      else{
         prevPiece = board[prevXCord][prevYCord];
         ref = (JButton)e.getSource();
         xCord = (int)ref.getClientProperty("column");
         yCord = (int)ref.getClientProperty("row");
         
         availableMove = prevPiece.canMove(board);
      
      if(availableMove[xCord][yCord]){
         board[xCord][yCord] = board[prevXCord][prevYCord];
         
         prevPiece.move(xCord,yCord);
         
         board[prevXCord][prevYCord] = new emptyPiece();
         curr.updateBoard();
         curr.printBoard();
         turn = !turn;
         }
         clicked = false;   
         
      }
   }
}