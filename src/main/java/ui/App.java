package ui;

import chess.ui.Board;
import chess.ui.JVentana;
import data.Data;
import rendering.ui.Display;

public class App {

    public static void main(String[] args) {
        // new JVentana();
        // create chess engine
        System.out.println(chess.piezas.Pieza.class.getClassLoader().getResource("2d/WROOK.png"));
        Data.board = new Board();
        Data.game = Data.board.toString();
        // create display and camera
        Display display3D = new Display("3D Renderer", 1000, 1000);//Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
        display3D.start();
    }
}
