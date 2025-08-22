package ProgramacionIII.finalJulio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Domino {
    int left, right;
    boolean used = false;

    Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    Domino flipped() {
        return new Domino(right, left);
    }

    @Override
    public String toString() {
        return left + "|" + right;
    }


}
class DominoCircle {

    public static boolean backtrack(List<Domino> pieces, List<Domino> path) {
        if (path.size() == pieces.size()) {
            // Verificar si el último conecta con el primero
            return path.get(path.size() - 1).right == path.get(0).left;
        }

        for (Domino d : pieces) {
            if (!d.used) {
                for (Domino candidate : Arrays.asList(d, d.flipped())) {
                    if (path.isEmpty() || path.get(path.size() - 1).right == candidate.left) {
                        candidate.used = true;
                        path.add(candidate);
                        if (backtrack(pieces, path)) return true;
                        path.remove(path.size() - 1);
                        candidate.used = false;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Domino> pieces = Arrays.asList(
                new Domino(7, 1), new Domino(6, 7), new Domino(8, 5),
                new Domino(3, 6), new Domino(3, 7), new Domino(1, 1),
                new Domino(4, 4)
        );

        List<Domino> path = new ArrayList<>();
        if (backtrack(pieces, path)) {
            System.out.println("Secuencia circular encontrada:");
            for (Domino d : path) System.out.print(d + " ");
        } else {
            System.out.println("No se encontró una secuencia válida.");
        }
    }
}

