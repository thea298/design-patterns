package exercises.chap4_ex2;

public class Shape implements DocumentElement{
    private String shapeType;

    public Shape(String shapeType){
        this.shapeType=shapeType;
    }
    
    @Override
    public void render(Renderer renderer) {
        renderer.renderShape(shapeType);
    }
    
}
