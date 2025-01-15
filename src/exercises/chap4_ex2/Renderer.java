package exercises.chap4_ex2;

//bridge implementation
public interface Renderer {
    void renderText(String text);
    void renderImage(String imagePath);
    void renderShape(String shapeType);
}
