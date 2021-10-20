package JavaCore;

public class Track {
    private double length;

    public Track(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTimeToOvercomePool(CanSwim swimmer) {
        return swimmer.run(this);
    }
}
