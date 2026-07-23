package core.basesyntax;
import java.util.Random;

public class Lottery {
    final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();

        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());

        Random random = new Random();
        int n = random.nextInt(MAX_NUMBER + 1);
        ball.setNumber(n);

        return ball;
    }
}
