package Behavioural.Strategy;

public class King implements ChessPiece{
    MoveStrategy moveStrategy;
    public King(MoveStrategy ms){
        this.moveStrategy = ms;
    }

    @Override
    public String toString() {
        return "King";
    }

    @Override
    public void move() {
        moveStrategy.move();
    }
}
