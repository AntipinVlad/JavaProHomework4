package obstacles;

public class Treadmill extends Obstacle implements Executable {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public int execute(int lengthRestriction) {
        return lengthRestriction - length;
    }
}
