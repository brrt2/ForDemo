package gameManagement.validation;

import gameManagement.Board;
import players.Player;

import java.util.function.Predicate;

public class InputValidator {

    public boolean validatePlayerName(String name) {
        String expression = "^[a-zA-Z ]*$";
        return name.matches(expression);
    }

    public boolean validateAdjacentSignsToWin(Predicate<Integer> pr,int adjacentSigns, int height, int width) {
        if(pr.test(adjacentSigns))return true;
        else return false;
    }

    public boolean validateBoardDimensions(Predicate<Integer> pr,int dimension) {
        if(pr.test(dimension))return true;
        else return false;
    }

    public void validateMove(int numbertoMark, Player player, Board board) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {

        String str = String.valueOf(numbertoMark);
//        int valueOfstr;
//            valueOfstr = Integer.parseInt(str);
        if (numbertoMark < 0 || numbertoMark > board.getPlayBoard().size()) {
            throw new IndexOutOfBoundsException("The provided number is outside the board ! ");
        } else {
            board.markTile(numbertoMark, player.getPlayerSign());
        }
        if (numbertoMark < 0) throw new ArrayIndexOutOfBoundsException();
    }

    public void checkIfTileTaken(int numbertoMark, String playerSign, Board board) throws IllegalArgumentException {
        if (board.getPlayBoard().get(numbertoMark - 1).getMark().equals("x") || board.getPlayBoard().get(numbertoMark - 1).getMark().equals("o")) {
            throw new IllegalArgumentException("The selected tile is already taken !");
        }
    }
}