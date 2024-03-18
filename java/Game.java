package main.java;

import main.java.data.Direction;

import javax.swing.*;
import java.awt.event.*;

public class Game {
    GameData data;
    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        data = new GameData();
        GameGraphics graphics = new GameGraphics();

        data.initialize();
        graphics.render(data);

        Timer timer = new Timer(100, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                data.update();
                graphics.render(data);
            }
        });

        timer.start();
        graphics.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    data.getBall().move(50, Direction.LEFT);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    data.getBall().move(50, Direction.RIGHT);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    data.getBall().move(50, Direction.DOWN);
                }
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    data.getBall().move(50, Direction.UP);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        });
            graphics.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getButton() == MouseEvent.BUTTON1);
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

    }
}
