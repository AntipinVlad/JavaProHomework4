import obstacles.Obstacle;
import obstacles.Treadmill;
import obstacles.Wall;
import participant.Participant;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Obstacle[] obstacleList = generateObstacles();

        Participant[] participantList = new Participant[] {
                new Participant("John", 400, 200),
                new Participant("HelloKitty", 150, 150),
                new Participant("R2D2", 1000, 20)
        };

        for (Participant participant : participantList) {
            System.out.println();
            System.out.printf("%s starting competition \n", participant.getName());
            processPlayer(participant, obstacleList, 0);
        }
    }

    private static void processPlayer(Participant player, Obstacle[] obstacleList, int index) {
        if (index > obstacleList.length - 1) {
            System.out.println();
            System.out.printf("%s FINISH COMPETITION! \n", player.getName());
            return;
        }
        Obstacle obstacle = obstacleList[index];

        if (obstacle instanceof Wall wall) {
            if (player.jump(wall)) {
                processPlayer(player, obstacleList, index += 1);
            } else {
                System.out.println();
                System.out.printf("%s LOOSING COMPETITION \n", player.getName());
            }
        } else if (obstacle instanceof Treadmill treadmill) {
            if (player.run(treadmill)) {
                processPlayer(player, obstacleList, index += 1);
            } else {
                System.out.println();
                System.out.printf("%s LOOSING COMPETITION", player.getName());
            }
        }
    }

    private static Obstacle[] generateObstacles() {
        Random random = new Random();
        Obstacle[] obstacles = new Obstacle[30];

        for (int i = 0; i < obstacles.length; i++) {
            obstacles[i] = random.nextBoolean() ? new Wall(random(2, 12)) : new Treadmill(random(4, 14));
        }

        return obstacles;
    }

    private static int random(int from, int to) {
        return (int) (from + Math.random() * (to - from));
    }
}