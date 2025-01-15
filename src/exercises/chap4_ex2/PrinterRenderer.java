package exercises.chap4_ex2;

public class PrinterRenderer implements Renderer{

    @Override
    public void renderImage(String imagePath) {
        System.out.println("Rendering image via printer "+imagePath);
    }

    @Override
    public void renderShape(String shapeType) {   
        System.out.println("Rendering shape via printer "+shapeType);
    }

    @Override
    public void renderText(String text) {
        System.out.println("Rendering text via printer "+text);
    }
}
