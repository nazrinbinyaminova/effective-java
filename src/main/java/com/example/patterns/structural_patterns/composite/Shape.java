package com.example.patterns.structural_patterns.composite;

import java.awt.*;

public interface Shape {
    int getX();

    int getY();

    int getWidth();

    int getHeight();

    void paint(Graphics graphics);
}
