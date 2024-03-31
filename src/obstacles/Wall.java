package obstacles;

public class Wall extends Obstacle implements Executable {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int execute(int jumpRestriction) {
        return jumpRestriction - height;
    }
}
