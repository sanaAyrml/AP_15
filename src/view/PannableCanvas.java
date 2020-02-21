package view;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.layout.Pane;

public class PannableCanvas extends Pane{
    DoubleProperty myScale = new SimpleDoubleProperty(1);

    public PannableCanvas() {
        setPrefSize(1800, 2700);

        // add scale transform
        scaleXProperty().bind(myScale);
        scaleYProperty().bind(myScale);
    }


    public double getScale() {
        return myScale.get();
    }

    public void setScale( double scale) {
        myScale.set(scale);
    }

    public void setPivot( double x, double y) {
        setTranslateX(getTranslateX()-x);
        setTranslateY(getTranslateY()-y);
    }
}
