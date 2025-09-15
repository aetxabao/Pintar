package edu.masanz.prog.pintar.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import edu.masanz.prog.pintar.manager.Manager;

public class MainController {

    @FXML
    private Canvas canvas;

    private Manager manager;

    @FXML
    public void initialize() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        manager = new Manager(gc);
    }

    @FXML
    void pinta(ActionEvent event) {
        manager.pinta();
    }

    @FXML
    void mueveDerecha(ActionEvent event) {
        manager.moverX(10);
    }

    @FXML
    void mueveIzquierda(ActionEvent event) {
        manager.moverX(-10);
    }

    @FXML
    void mueveArriba(ActionEvent event) {
        manager.moverY(-10);
    }

    @FXML
    void mueveAbajo(ActionEvent event) {
        manager.moverY(10);
    }

}
