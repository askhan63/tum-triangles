package com.example.tumtriangle;


import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;
import java.util.List;

public class TUMTriangle extends Application {

    private static final Color PAINT_BLUE = Color.valueOf("#316EB2");
    private static final Color PAINT_WHITE = Color.valueOf("#ffffff");

    private @NonNull List<Triangle> triangles = new ArrayList<>();

    /**
     * Creates the TUM triangle recursively by adding the generated triangles to the triangles
     * to the triangles attribute in the object.
     * @param top The offset from the top
     * @param left The offset from the left
     * @param height The height of the triangle
     * @param depth The recursion depth
     */
    public void createTUMTriangle(double top, double left, double height, int depth) {
        // TODO: Task 1: create the TUM triangle

// pre
        if (depth == 0) {
            return;
        }

        if (depth == 1) {
            Point right = new Point(left + height,top+height/2);
            Point topPoint = new Point(left, top);
            Point downPoint = new Point(left , top + height );
            Point p1 = new Point(left + height/2,top+ height * 3/4);
            Point p2 = new Point(left + height/2, top + height/4);
            Point p3 = new Point(left , top + height/2 );
            triangles.add(new Triangle(right, downPoint, topPoint, PAINT_BLUE));
         triangles.add(new Triangle(p1,p2,p3, PAINT_WHITE));
        } else {
            createTUMTriangle(top,left,height/2,depth-1);
            createTUMTriangle(top+height/2,left,height/2,depth-1);
             createTUMTriangle(top+height/4,left+height/2,height/2,depth-1);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage)  {
        this.triangles = new ArrayList<>();
        SimplePad simplePad = new SimplePad(400 , 400);
        stage.setTitle("TUM triangle");
        stage.setScene(simplePad);
        stage.setResizable(false);
        stage.show();
        createTUMTriangle(0, 0, 100, 1);
        for (Triangle triangle : triangles) {
            simplePad.drawTriangle(triangle);
        }
    }
}
