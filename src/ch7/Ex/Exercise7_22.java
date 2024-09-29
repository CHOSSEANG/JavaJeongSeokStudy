package ch7.Ex;

import java.awt.*;

abstract class Shape{
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPoisition(Point p) {
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}

class Circle extends Shape{
    double r;

    Circle() {
    }

    Circle(double r) {
        this.r = r;
    }

    @Override
    double calcArea() {
        return r;
    }
}

class Rectangle extends Shape{
    int width;
    int height;

    Rectangle() {

    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    double calcArea() {
        return width * height;
    }

    boolean isSquare() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }
}


class Exercise7_22 {
}
