package JavaCore;

public class Greydwarf extends Team implements CanSwim {
    private int swimmingSpeed;

    public Greydwarf(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {

    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }


    public double swim(Pool pool) {
        System.out.println(name + " Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }

    @Override
    public double go(Road road) {
        System.out.println(name + " Затратил " + road.getLength() / swimmingSpeed);
        return road.getLength() / swimmingSpeed;
    }

    @Override
    public double run(Track track) {
        System.out.println(name + " Затратил " + track.getLength() / swimmingSpeed);
        return track.getLength() / swimmingSpeed;
    }
}