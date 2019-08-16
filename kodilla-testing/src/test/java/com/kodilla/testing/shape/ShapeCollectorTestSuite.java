package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure()
    {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();

        shapeCollector.addFigure(triangle);

        Assert.assertEquals(triangle, shapeCollector.getFigure(0));

    }

    @Test
    public void testRemoveFigure()
    {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(triangle);

        Assert.assertEquals("Circle 4\n", shapeCollector.showFigures());
    }

    @Test
    public void testGetFigure()
    {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();

        shapeCollector.addFigure(triangle);
        Triangle result = (Triangle)shapeCollector.getFigure(0);

        Assert.assertEquals(result, triangle );
    }

    @Test
    public void testShowFigures()
    {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();

        shapeCollector.addFigure(square);

        Assert.assertEquals("Square 4\n", shapeCollector.showFigures() );
    }
}
