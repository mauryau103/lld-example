package main.java.org.example.tictactoedemo;

import main.java.org.example.tictactoedemo.model.*;

import java.util.*;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {
        players = new LinkedList<>();
        PlayingPieceX playingPieceX = new PlayingPieceX();
        Player player1 = new Player("Player1", playingPieceX);

        PlayingPieceO playingPieceO = new PlayingPieceO();
        Player player2 = new Player("Player2", playingPieceO);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();

            List<Map.Entry<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            //read the userInputs
            System.out.print("Player:" + playerTurn.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int InputRow = Integer.parseInt(values[0]);
            int InputColumn = Integer.parseInt(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(InputRow, InputColumn, playerTurn.playingPiece);
            if (!pieceAddedSuccessfully) {
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addFirst(playerTurn);
            boolean winner = isThereWinner(InputRow, InputColumn, playerTurn.playingPiece.pieceType);
            if (winner) {
                return playerTurn.getName();
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for (int i = 0; i < gameBoard.size; i++) {

            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for (int i = 0; i < gameBoard.size; i++) {

            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }


}
