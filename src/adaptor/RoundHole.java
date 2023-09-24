package adaptor;

public class RoundHole {
    private Integer radius;

    public RoundHole(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
      return this.radius;
    }
    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
