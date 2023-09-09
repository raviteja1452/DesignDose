package p3;

public class MaruthiCar implements Car {
    @Override
    public void moveForward() {
        System.out.println("moveForward");
    }

    @Override
    public void moveBackward() {
        //
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void applyBreak() {
        System.out.println("applyBreak");
    }

    @Override
    public void moveRight() {
        System.out.println("moveRight");
    }

    @Override
    public void moveLeft() {
        System.out.println("moveLeft");
    }

    @Override
    public void playMusic() {
        System.out.println("playMusic");
    }
}
