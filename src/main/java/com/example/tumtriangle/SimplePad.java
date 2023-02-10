package com.example.tumtriangle;


import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import org.checkerframework.checker.nullness.qual.NonNull;

public class SimplePad extends Scene {


    public SimplePad(double width, double height) {
        super(new Pane(), width, height);
    }

    /**
     * Draws a triangle on the SimplePad scene
     * @param triangle The triangle to draw
     */
    public void drawTriangle(@NonNull Triangle triangle) {
        Polygon polygon = new Polygon(triangle.getP1().getX(), triangle.getP1().getY(),
                triangle.getP2().getX(), triangle.getP2().getY(),
                triangle.getP3().getX(), triangle.getP3().getY());

        polygon.setFill(triangle.getPaint());

        ((Pane) getRoot()).getChildren().add(polygon);
    }


}
