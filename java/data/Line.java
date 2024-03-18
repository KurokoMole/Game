package main.java.data;

import java.awt.*;

public class Line {
    private int x;
    private int y;
    private int width;
    private int height;
    private int startAngle;
    private int arcAngle;
    private Color color;

    public Line(int x, int y, int height, int width, int startAngle, int arcAngle, Color color ) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
        this.color = color;

    }

    public void move(int steps, Direction direction) {
        switch (direction) {
            case DOWN -> {
                y += steps;
            }
            case UP -> {
                y -= steps;
            }
            case LEFT -> {
                x -= steps;
            }
            case RIGHT -> {
                x += steps;
            }
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int x2) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int Y2) {
        this.height = height;
    }

    public int getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle;
    }

    public int getArcAngle() {
        return arcAngle;
    }

    public void setArcAngle(int arcAngle) {
        this.arcAngle = arcAngle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
