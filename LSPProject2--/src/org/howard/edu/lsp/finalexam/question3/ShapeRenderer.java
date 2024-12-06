package org.howard.edu.lsp.finalexam.question3;

public class ShapeRenderer {
    private static final ShapeRenderer instance = new ShapeRenderer();
    private final ShapeFactory shapeFactory;

    private ShapeRenderer() {
        shapeFactory = new ShapeFactory();
    }

    public static ShapeRenderer getInstance() {
        return instance;
    }

    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.createShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }
}

class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            return null;
        }
    }
}

// Supporting Shape Classes (remain unchanged)
//Factory Pattern:
//
//https://refactoring.guru/design-patterns/factory-method
//https://www.baeldung.com/java-factory-pattern
//https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
//Singleton Pattern:
//https://www.baeldung.com/java-singleton
//https://refactoring.guru/design-patterns/singleton
//https://www.geeksforgeeks.org/singleton-class-java/
class Circle {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
