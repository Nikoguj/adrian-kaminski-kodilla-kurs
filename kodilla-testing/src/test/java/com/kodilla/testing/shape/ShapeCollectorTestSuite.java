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

        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(triangle);

        Assert.assertEquals(0, shapeCollector.showFigures());
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
        Triangle triangle = new Triangle();

        shapeCollector.addFigure(triangle);
        int result = shapeCollector.showFigures();

        Assert.assertEquals(1, result );
    }
}
