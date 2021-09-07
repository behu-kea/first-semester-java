import java.util.Random;
import java.util.Scanner;

import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Exercises {
    public static void main(String[] args) {
        GraphicsContext gc = cv.getGraphicsContext2D();
        gc.clearRect(0, 0, 650, 700);
        gc.setFill(Color.GREEN);
        gc.fillOval(210, 210, 180, 180);
    }
}


