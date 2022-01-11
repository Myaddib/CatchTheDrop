package ru.geekbrains.catch_the_drop;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static GameWindow game_window;

    public static void main(String[] args) {
        game_window = new GameWindow(); //класс + сылка объект окна
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //настройка окна при закрытие
        game_window.setLocation(200, 100); //где будет появлятся окно
        game_window.setSize(906, 478); // размер окна
        game_window.setResizable(false); // запретить изменение окна
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setVisible(true); // сделать видимым окно
    }

    private static void onRepaint (Graphics g) { // рисовать
        g.fillOval(10,10,200,100);
        g.drawLine(13,72,400,400);
        g.drawLine(208,55,400,400);
    }

    private static class GameField extends JPanel{ //класс понели

        @Override
        protected void paintComponent (Graphics g){
            super.paintComponent(g); //сначало он
            onRepaint(g);
        }
    }
}