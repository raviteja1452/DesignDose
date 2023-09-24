package adaptor;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);

        RoundPeg smallPeg = new RoundPeg(4);
        RoundPeg largePeg = new RoundPeg(10);

        System.out.println("small peg with radius :" + smallPeg.getRadius() + " in roundHole of radius  :"
                + roundHole.getRadius() + ", fits :" + roundHole.fits(smallPeg));

        System.out.println("large peg with radius :" + largePeg.getRadius() + " in roundHole of radius  :"
                + roundHole.getRadius() + ", fits :" + roundHole.fits(largePeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(15);


        System.out.println("small square peg with width :" + smallSquarePeg.getWidth() + " in roundHole of radius  :"
                + roundHole.getRadius() + ", fits :" + roundHole.fits(new SquareRoundPegAdaptor(smallSquarePeg)));

        System.out.println("large square peg with width :" + largeSquarePeg.getWidth() + " in roundHole of radius  :"
                + roundHole.getRadius() + ", fits :" + roundHole.fits(new SquareRoundPegAdaptor(largeSquarePeg)));

    }
}
