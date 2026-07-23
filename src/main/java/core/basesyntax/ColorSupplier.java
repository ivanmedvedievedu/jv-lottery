package core.basesyntax;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int n = Colors.values().length;

        Random random = new Random();
        int index = random.nextInt(n);

        Colors color = Colors.values()[index];
        return switch (color) {
            case RED -> "red";
            case BLUE -> "blue";
            case YELLOW -> "yellow";
            case GREEN -> "green";
        };
    }
}
