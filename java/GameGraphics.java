package main.java;

import main.java.data.Ball;
import main.java.data.Enemy;

import javax.swing.*;
import java.awt.*;

public class GameGraphics extends JFrame {
    GameData data;

    public GameGraphics() throws HeadlessException {
        Draw draw = new Draw();
        add(draw);

        this.data = null;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1080,720);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void render(GameData data) {
        this.data = data;

        Enemy enemy = data.getEnemy();
        if (enemy != null) {
            Ball ball = data.getBall(); 
            if (ball.getBounds().intersects(enemy.getBounds())) {
                data.setEnemy(null);
            }
        }
        repaint();
    }

    class Draw extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (data != null) {
                g.setColor(data.getBall().getColor());
                g.fillOval(data.getBall().getX(), data.getBall().getY(), data.getBall().getWidth(), data.getBall().getHeight());

                g.setColor(data.getLine().getColor());
                g.drawArc(data.getLine().getX(), data.getLine().getY(), data.getLine().getWidth(), data.getLine().getHeight(), data.getLine().getStartAngle(), data.getLine().getArcAngle());

                if (data.getEnemy() != null) {
                    g.setColor(data.getEnemy().getColor());
                    g.fillOval(data.getEnemy().getX(), data.getEnemy().getY(), data.getEnemy().getWidth(), data.getEnemy().getHeight());
                }
            }
        }
    }


}
