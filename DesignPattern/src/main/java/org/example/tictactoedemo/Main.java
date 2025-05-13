package main.java.org.example.tictactoedemo;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.initializeGame();
        System.out.println("game winner is: " + ticTacToeGame.startGame());
    }
}
