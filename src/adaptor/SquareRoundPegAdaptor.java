package adaptor;

public class SquareRoundPegAdaptor extends RoundPeg {

    private SquarePeg squarePeg;
    public SquareRoundPegAdaptor(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }


    @Override
    public Integer getRadius() {
        Double radius = squarePeg.getWidth() *  Math.sqrt(2)/2;
        return radius.intValue();
    }
}
