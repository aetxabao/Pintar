package edu.masanz.prog.pintar.manager;

import edu.masanz.prog.pintar.model.Circle;
import javafx.scene.canvas.GraphicsContext;

public class Manager {

    /* Declaración de los atributos */
    private Pintor pintor;
    private Circle c1;

    public Manager(GraphicsContext gc) {
        /* Instanciación de los atributos */
        this.pintor = new Pintor(gc);
        c1 = new Circle(100, 100, 50, 5, "RED");
    }

    public void pinta() {
        pintor.limpiaCanvas();
        pintor.pinta(c1);
    }

    public void moverX(double ax) {
        c1.avanzar(ax, 0);
    }

    public void moverY(double ay) {
        c1.avanzar(0, ay);
    }

}
