package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeRendererTest {

    @Test
    public void testRenderCircle() {
        ShapeRenderer renderer = ShapeRenderer.getInstance();
        renderer.renderShape("circle");
        // Assert the output using a mocking framework or by capturing console output
        // For example, using a mocking framework like Mockito:
        // Mockito.verify(shapeFactory).createShape("circle");
        // Mockito.verify(circle).draw();
    }

    @Test
    public void testRenderRectangle() {
        // ... similar to the testRenderCircle() method
    }

    @Test
    public void testRenderTriangle() {
        // ... similar to the testRenderCircle() method
    }

    @Test
    public void testRenderUnknownShape() {
        ShapeRenderer renderer = ShapeRenderer.getInstance();
        renderer.renderShape("hexagon");
        // Assert the appropriate error message is printed
    }
}
