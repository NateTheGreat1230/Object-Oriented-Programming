package com.newproj.newproject;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.util.Duration;

public class Main extends Application {

@Override
    public void start(Stage primaryStage) {

    Polygon pentagon = new Polygon();

    pentagon.setFill(Color.WHITE);
    pentagon.setStroke(Color.BLACK);
    pentagon.getPoints().addAll(200.0, 300.0, 300.0, 600.0, 700.0, 600.0, 800.0, 300.0, 500.0, 100.0);


    Polygon rectangle = new Polygon();
    rectangle.setFill(Color.RED);

    rectangle.getPoints().addAll(200.0, 300.0, 200.0, 400.0, 300.0, 400.0, 300.0, 300.0);

    Group group = new Group(pentagon, rectangle);
    Scene scene = new Scene(group, 1000, 1000);

    Duration duration = Duration.millis(1000);

    TranslateTransition transition1 = new TranslateTransition(duration, rectangle);
    TranslateTransition transition2 = new TranslateTransition(duration, rectangle);
    TranslateTransition transition3 = new TranslateTransition(duration, rectangle);
    TranslateTransition transition4 = new TranslateTransition(duration, rectangle);
    TranslateTransition transition5 = new TranslateTransition(duration, rectangle);




    int i=1;
    while (i<5) {
        if (i == 1) {
            transition1.setCycleCount(1);
            transition1.play();
            i++;
        } else if (i == 2) {
            transition2.setCycleCount(1);
            transition2.play();
            i++;
        } else if (i == 3) {
            transition3.setCycleCount(1);
            transition3.play();
            i++;
        } else if (i == 4) {
            transition4.setCycleCount(1);
            transition4.play();
            i++;
        } else {
            transition5.setCycleCount(1);
            transition5.play();
            i++;
        }
    }
    scene.setOnMousePressed(e -> {
        transition1.pause();
        transition2.pause();
        transition3.pause();
        transition4.pause();
        transition5.pause();

    });

    scene.setOnMouseReleased(e -> {
        transition1.play();
        transition2.play();
        transition3.play();
        transition4.play();
        transition5.play();

    });
    primaryStage.setScene(scene);
    primaryStage.show();
    }

}