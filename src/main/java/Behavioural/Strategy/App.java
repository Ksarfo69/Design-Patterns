package Behavioural.Strategy;

public class App{
    public static void main(String[] args) {
        MoveStrategy diagonal = new Diagonal();
        MoveStrategy up = new Up();

        King king = new King(up);
        Queen queen = new Queen(diagonal);

        System.out.print("King: ");
        king.move();
        System.out.print("Queen: ");
        queen.move();
    }
}