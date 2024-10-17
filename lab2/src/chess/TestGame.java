package chess;

import java.util.Scanner;
import java.util.Vector;

public class TestGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfPieces = scan.nextInt();
        Vector<Piece> pieces = new Vector<Piece>();
        for (int i = 0; i < numOfPieces; ++i) {
            System.out.println("Which piece do you want to add?\n 1. King\n 2. Queen\n 3. Rook\n"
                    + " 4. Knight\n 5. Bishop\n 6. Pawn");
            int pieceType = scan.nextInt();
            int ver = (int) scan.next().charAt(0) - (int) 'a' + 1;
            int hor = scan.nextInt();
            if (!(ver >= 1 && ver <= 8 && hor >= 1 && hor <= 8)) {
                System.out.println("Invalid position");
                i--;
                continue;
            }

            Position pos = new Position(ver, hor);
            Piece piece = null;
            switch (pieceType) {
                case 1:
                    piece = new King(pos);
                    break;
                case 2:
                    piece = new Queen(pos);
                    break;
                case 3:
                    piece = new Rook(pos);
                    break;
                case 4:
                    piece = new Knight(pos);
                    break;
                case 5:
                    piece = new Bishop(pos);
                    break;
                case 6:
                    if (ver >= 2 && ver <= 7) {
                        piece = new Pawn(pos);
                    } else {
                        System.out.println("Invalid position for Pawn");
                        i--;
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid piece type");
                    i--;
                    continue;
            }

            pieces.add(piece);
        }
        
        //Check moves
        for(int i = 0; i < numOfPieces; ++i) {
        	int ver = (int) scan.next().charAt(0) - (int) 'a' + 1;
            int hor = scan.nextInt();
            if (!(ver >= 1 && ver <= 8 && hor >= 1 && hor <= 8)) {
                System.out.println("Invalid position");
                i--;
                continue;
            }
            Position move = new Position(ver, hor);
            Piece pieceToMove = pieces.get(i);
            if(pieceToMove.isLegalMove(move)) {
            	System.out.println("for " + pieceToMove.name() + " move is legal");
            } else {
            	System.out.println("for " + pieceToMove.name() + " move is illegal");
            }
            
        }
        scan.close();
    }
}
