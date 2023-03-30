package com.example.patterns.structural_patterns.composite;

import java.awt.*;

public class Circle extends BaseShape {
    public int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(getX(), getY(), getWidth() - 1, getHeight() - 1);
    }
}
