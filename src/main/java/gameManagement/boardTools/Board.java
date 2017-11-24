package gameManagement;

import gameManagement.tiles.TakenTileSign;
import gameManagement.tiles.Tile;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int row;
    private int column;
    private List<Tile> playBoard;
    private int moveCounter = 0;


    public Board(int row, int column) {
        playBoard = new ArrayList<Tile>(row * column);
        this.row = row;
        this.column = column;
        populateTheBoard();
    }

    public void populateTheBoard() {
        for (int i = 0; i < row * column; i++) {
            playBoard.add(new Tile(i + 1));
        }
    }

    public void markTile(int number, TakenTileSign takenTileSign) {
        playBoard.get(number - 1).setTakenTileSign(takenTileSign);
        moveCounter++;
    }

    public void clearBoard() {
        playBoard = new ArrayList<Tile>(row * column);
        populateTheBoard();
    }

    public List<Tile> getPlayBoard() {
        return playBoard;
    }


    @Override
    public String toString() {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (Tile tile : playBoard) {
            sb.append(tile);
            count++;
            if (count == column) {
                sb.append(" \n");
                count = 0;
            }
        }
        return sb.toString();
    }



    public int getColumn() {
        return column;
    }

    public int getMoveCounter() {
        return moveCounter;
    }

    public void setMoveCounter(int moveCounter) {
        this.moveCounter = moveCounter;
    }
}