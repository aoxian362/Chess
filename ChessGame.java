import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.util.ArrayList;


public class ChessGame extends JFrame{
public ArrayList<Piece> whiteAvPiece;
public ArrayList<Piece> blackAvPiece;

public JButton[][] boardSquares;
public Piece[][] pieceBoard;
public JPanel mainPanel;
public int[][] whiteStartingPos;
public int[][] blackStartingPos;
public King wKing;
public King bKing;
   public ChessGame(){
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      StartUp();
      buildPanel();
      setSize(700,700);
      add(mainPanel);
      setVisible(true);
   }
   public void StartUp(){

   pieceBoard = new Piece[8][8];
   whiteAvPiece = new ArrayList<Piece>();
   blackAvPiece = new ArrayList<Piece>();
   
   Pawn[] wPawns = new Pawn[8];
   
   
   Rook wRook1 = new Rook(true,0,0);
   whiteAvPiece.add(wRook1);
   Rook wRook2 = new Rook(true,0,7);
   whiteAvPiece.add(wRook2);
   Knight wKnight1 = new Knight(true,0,1);
   whiteAvPiece.add(wKnight1);
   Knight wKnight2 = new Knight(true,0,6);
   whiteAvPiece.add(wKnight2);
   Bishop wBishop1 = new Bishop(true,0,2);
   whiteAvPiece.add(wBishop1);
   Bishop wBishop2 = new Bishop(true,0,5);
   whiteAvPiece.add(wBishop2);
   Queen wQueen = new Queen(true,0,3);
   whiteAvPiece.add(wQueen);
   wKing = new King(true,0,4);
   whiteAvPiece.add(wKing);
   
   
   Pawn[] bPawns = new Pawn[8];
   Rook bRook1 = new Rook(false,7,0);
   blackAvPiece.add(bRook1);
   Rook bRook2 = new Rook(false,7,7);
   blackAvPiece.add(bRook2);
   Knight bKnight1 = new Knight(false,7,1);
   blackAvPiece.add(bKnight1);
   Knight bKnight2 = new Knight(false,7,6);
   blackAvPiece.add(bKnight2);
   Bishop bBishop1 = new Bishop(false,7,2);
   blackAvPiece.add(bBishop1);
   Bishop bBishop2 = new Bishop(false,7,5);
   blackAvPiece.add(bBishop2);
   Queen bQueen = new Queen(false,7,3);
   blackAvPiece.add(bQueen);
   bKing = new King(false,7,4);
   blackAvPiece.add(bKing);
   

   
   for(int i=0; i<8; i++){
   wPawns[i] = new Pawn(true,1,i);
   whiteAvPiece.add(wPawns[i]);
   bPawns[i] = new Pawn(false,6,i);
   blackAvPiece.add(bPawns[i]);
   
   }
   
   int count=0;
   
   while(whiteAvPiece.size() > count){
   Piece ref = whiteAvPiece.get(count);
   pieceBoard[ref.xCord][ref.yCord] = ref;
   count++;
   }
   
   count = 0;
    while(blackAvPiece.size() > count){
   Piece ref = blackAvPiece.get(count);
   pieceBoard[ref.xCord][ref.yCord] = ref;
   count++;
   }
   
   for(int i=0; i<8; i++)
      for(int l=0; l<8; l++){
         if(pieceBoard[i][l] == null)
         pieceBoard[i][l] = new emptyPiece();
      }
      
      
   }
   
   public void updateBoard(){
   for(int i=0; i<8; i++)
      for(int l=0; l<8; l++){
      if(pieceBoard[i][l].PieceID() == 0)
      boardSquares[i][l].setIcon(null);
      else
      boardSquares[i][l].setIcon(new ImageIcon(pieceBoard[i][l].PieceImage()));
      }
   }

   
   public void printBoard(){
   String[] pieces = {"0 ","p ", "Kn", "B ","R ","Q ","K "};
   for(int i=7; i>=0; i--){
      for(int l=0; l<8; l++){
      System.out.print(pieces[pieceBoard[i][l].PieceID()]);
      }
      System.out.println();
      
   }
   System.out.println();
   }
   public void buildPanel(){
   chessListener cl = new chessListener(pieceBoard,wKing,bKing,this);
   mainPanel = new JPanel();
   mainPanel.setLayout(new GridLayout(8,8));
   boardSquares = new JButton[8][8];
   for(int i=0; i<8; i++)
      for(int l=0; l<8; l++){
         boardSquares[i][l] = new JButton();
         boardSquares[i][l].putClientProperty("column",i);
         boardSquares[i][l].putClientProperty("row",l);
         boardSquares[i][l].addActionListener(cl);
         
         if(i%2 != l%2)
            boardSquares[i][l].setBackground(Color.RED);
         else
            boardSquares[i][l].setBackground(new Color(100,100,100));

         mainPanel.add(boardSquares[i][l],i,l);
         
      }
      
      
      updateBoard();
   
   }
   
   public static void main(String[] args){
   new ChessGame();
   }
}