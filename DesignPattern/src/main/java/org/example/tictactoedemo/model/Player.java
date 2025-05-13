package main.java.org.example.tictactoedemo.model;

public class Player {
    String name;
    public PlayingPiece playingPiece;


    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }

    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }
}
