package gameManagement.moveManagement;

import java.util.ArrayList;
import java.util.List;

public class MoveHistory {

    private static List<Move> moveArchive = new ArrayList<>();

    public static void addToArchive(Move move) {
        moveArchive.add(move);
    }

    public static List<Move> getMoveArchive() {
        return moveArchive;
    }
}