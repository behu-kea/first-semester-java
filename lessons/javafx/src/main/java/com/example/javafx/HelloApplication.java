package com.example.javafx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HelloApplication extends Application {
    static int width = 600;
    static int height = 600;
    static Canvas canvas = new Canvas(width, height);
    static GraphicsContext gc = canvas.getGraphicsContext2D();
    
    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Group root = new Group();
        Scene scene = new Scene(root, width, height);
        stage.setTitle("Face");
        stage.setScene(scene);

        gc.clearRect(0, 0, width, height);
        root.getChildren().add(canvas);

        drawPrimitiveFace();
        stage.show();


        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            gc.clearRect(0, 0, width, height);
            try {
                drawPrimitiveFace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        timeline.setCycleCount(360);
        timeline.play();
    }

    public static void drawPrimitiveFace() throws InterruptedException {
        drawShape();
        Random r = new Random();
        int low = 10;
        int high = 20;
        int result = r.nextInt(high - low) + low;
        drawMouth(result);
        drawEyes();
    }

    public static void drawShape() {
        gc.strokeOval(150, 150, 300, 300);
    }

    public static void drawMouth(int mouthSize) {
        gc.setFill(Color.BLACK);
        gc.fillOval(280, 370, mouthSize, mouthSize);
    }

    public static void drawEyes() {
        gc.setFill(Color.BLACK);
        gc.fillOval(220, 220, 20, 20);
        gc.fillOval(360, 220, 20, 20);
    }

    public static void main(String[] args) {
        launch();
    }
}