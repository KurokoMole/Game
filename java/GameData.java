package main.java;

import main.java.data.Ball;
import main.java.data.Direction;
import main.java.data.Enemy;
import main.java.data.Line;

import java.awt.*;

public class GameData {
    private Line line;
    private Ball ball;
    private Enemy enemy;

    public void update() {
        ball.move(5, Direction.RIGHT);
        line.move(5, Direction.RIGHT);
        if (enemy != null) {
            enemy.move(5, Direction.LEFT);
        }
    }

    public void initialize() {
        ball = new Ball(20, 20, 50, 50, Color.RED);
        line = new Line(10, 90, 50, 70, 100, 200, Color.GREEN);
        enemy = new Enemy(1000, 20, 50, 50, Color.BLUE);
    }

    public Line getLine() {
        return line;
    }

    public Ball getBall() {
        return ball;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy ;
    }
}
