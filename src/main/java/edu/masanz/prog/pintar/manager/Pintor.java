package edu.masanz.prog.pintar.manager;

import edu.masanz.prog.pintar.model.Circle;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Pintor {

    public static final Paint COLOR_CANVAS_BACKGROUND = Color.WHITE;

    private GraphicsContext gc;

    public Pintor(GraphicsContext gc) {
        this.gc = gc;
    }

    public void limpiaCanvas() {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        gc.setFill(COLOR_CANVAS_BACKGROUND);
        gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }

    public void pinta(Circle circle) {
        gc.setStroke(circle.getColor());
        gc.setLineWidth(circle.getStrokeWidth());
        gc.strokeOval(circle.getX() - circle.getRadius(), circle.getY() - circle.getRadius(),
                circle.getRadius() * 2, circle.getRadius() * 2);
    }

}
