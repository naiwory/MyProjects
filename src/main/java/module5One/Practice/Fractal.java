package module5One.Practice;

import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class Fractal {
    private int depth;                      // глубина фрактала (кол-во итераций отрисовки)
    private float percentOffset;            // отступ от начала линии предыдущей итерации отрисовки
    private final Triangle initTriangle;    // начальный треугольник

    private ArrayList<Triangle> triangleArrayList = new ArrayList<>();

    public Fractal(int depth, float percentOffset, Triangle initTriangle) {
        this.depth = depth;
        this.percentOffset = percentOffset;
        this.initTriangle = initTriangle;
    }

    // отрисовывает одну итерацию фрактала и вызывает себя рекурсивно до тех пор пока не нарисует все итерации
    private void draw(int currentDepth, Triangle triangle, Pane root) {
        if (currentDepth > 0) {
            Point newA = triangle.getL1().getPointOnLine(percentOffset);
            Point newB = triangle.getL2().getPointOnLine(percentOffset);
            Point newC = triangle.getL3().getPointOnLine(percentOffset);

            Triangle newTriangle = new Triangle(newA, newB, newC);

            draw(--currentDepth, newTriangle, root);
        }

        triangleArrayList.add(triangle);
        triangle.draw(root);
    }

    // отрисовывает весь фрактал
    public void draw(Pane root) {
        triangleArrayList.clear();

        draw(depth, initTriangle, root);
    }

    // очищает с экрана данный фрактал
    public void clear(Pane root) {
        for (Triangle triangle : triangleArrayList)
            triangle.clear(root);
    }
}
