package Behavioural.Strategy;

public class Queen implements ChessPiece{
    MoveStrategy moveStrategy;
    public Queen(MoveStrategy ms){
        this.moveStrategy = ms;
    }

    @Override
    public String toString() {
        return "Queen";
    }

    @Override
    public void move() {
        moveStrategy.move();
    }
}
