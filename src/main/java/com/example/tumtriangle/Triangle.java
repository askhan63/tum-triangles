package com.example.tumtriangle;


import javafx.scene.paint.Paint;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Representation of a triangle
 */
public class Triangle {

    private final @NonNull Point p1;
    private final @NonNull Point p2;
    private final @NonNull Point p3;
    private final @NonNull Paint paint;

    public Triangle(
            @NonNull Point p1,
            @NonNull Point p2,
            @NonNull Point p3,
            @NonNull Paint paint) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.paint = paint;
    }

    public @NonNull Point getP1() {
        return p1;
    }

    public @NonNull Point getP2() {
        return p2;
    }

    public @NonNull Point getP3() {
        return p3;
    }

    public @NonNull Paint getPaint() {
        return paint;
    }

    @Override
    public String toString() {
        return "Triangle{" 
            + "p1=" + p1
            + ", p2=" + p2
            + ", p3=" + p3
            + ", paint=" + paint
            + '}';
    }
}
