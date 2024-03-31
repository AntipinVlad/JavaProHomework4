package participant;

import obstacles.Treadmill;
import obstacles.Wall;

public class Participant implements Jumping, Running{
    private String name;
    private int trackLength;
    private int jumpHeight;

    public Participant(String name, int trackLength, int jumpHeight) {
        this.name = name;
        this.trackLength = trackLength;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean jump(Wall wall) {
        jumpHeight = wall.execute(jumpHeight);
        System.out.printf("%s jump over the wall \n", name);
        return jumpHeight > 0;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        trackLength = treadmill.execute(trackLength);
        System.out.printf("%s run all the treadmill \n", name);
        return trackLength > 0;
    }
}
