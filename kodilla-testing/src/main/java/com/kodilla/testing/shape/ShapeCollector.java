package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    /*public int showFigures()
    {
        return shapes.size(); // String zwracający nazwe pole itp/
    }*/

    public String showFigures() {
        String result = "";
        for (Shape shape : shapes) {
            result = result + shape.getShapeName() + " " + shape.getField() + "\n";
        }
        return result;
    }
}
