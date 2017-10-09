package module5One.Practice;

public class Fractal {
    private int depth;
    private float percentOffset;

    public Fractal(int depth, float percentOffset) {
        this.depth = depth;
        this.percentOffset = percentOffset;
    }

    private void draw(int currentDepth, Triangle triangle){
        if(currentDepth == 0)
            return;
        draw(currentDepth - 1, triangle);
    }

    public void draw(int depth){

    }

    public void clear(){

    }
}
