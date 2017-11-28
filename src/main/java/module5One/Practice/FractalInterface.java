package module5One.practice;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class FractalInterface {
    private Fractal fractal;

    public void fractalInterfaceInit (Pane root) {
        final TextField textDepth = new TextField();
        textDepth.setPromptText("Глубина фрактала");
        textDepth.setPrefColumnCount(15);
        textDepth.setTranslateX(10);
        textDepth.setTranslateY(10);

        final TextField textPercentOffset = new TextField();
        textPercentOffset.setPromptText("Процентный отступ по линии");
        textPercentOffset.setPrefColumnCount(15);
        textPercentOffset.setTranslateX(10);
        textPercentOffset.setTranslateY(45);

        Label labelStatus = new Label("Введите параметры");
        labelStatus.setTranslateX(10);
        labelStatus.setTranslateY(80);

        Button buttonDraw = new Button("Отрисовать");
        buttonDraw.setTranslateX(220);
        buttonDraw.setTranslateY(10);

        Button buttonClear = new Button("Очистить");
        buttonClear.setTranslateX(220);
        buttonClear.setTranslateY(45);

        root.getChildren().addAll(textDepth, textPercentOffset, labelStatus, buttonDraw, buttonClear);

        buttonDraw.setOnAction((ActionEvent event) -> {
            if (textDepth.getText() == null || textDepth.getText().isEmpty()) {
                labelStatus.setText("Введите глубину фрактала");
                return;
            }

            if (textPercentOffset.getText() == null || textPercentOffset.getText().isEmpty()) {
                labelStatus.setText("Введите процентный отступ по линии");
                return;
            }

            int depth = Integer.parseInt(textDepth.getText());
            float percentOffset = Integer.parseInt(textPercentOffset.getText()) / 100f;

            fractalClear(root);
            fractalDraw(root, depth, percentOffset);

            labelStatus.setText("Фрактал отрисован");
        });

        buttonClear.setOnAction((ActionEvent event) -> {
            fractalClear(root);

            labelStatus.setText("Введите параметры");
        });
    }

    private void fractalDraw(Pane root, int depth, float percentOffset) {
        Point pointA = new Point(100, 500);
        Point pointB = new Point(300, 200);
        Point pointC = new Point(500, 500);

        Triangle initTriangle = new Triangle(pointA, pointB, pointC);

        if (fractal == null) fractal = new Fractal(depth, percentOffset, initTriangle);

        fractal.draw(root);
    }

    private void fractalClear(Pane root) {
        if (fractal != null) {
            fractal.clear(root);
            fractal = null;
        }
    }
}
