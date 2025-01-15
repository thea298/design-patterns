package exercises.chap4_ex2;

public class PdfRenderer implements Renderer{
    
    @Override
    public void renderImage(String imagePath) {
        System.out.println("Rendering image in pdf "+imagePath);
    }

    @Override
    public void renderShape(String shapeType) {   
        System.out.println("Rendering shape in pdf "+shapeType);
    }

    @Override
    public void renderText(String text) {
        System.out.println("Rendering text in pdf "+text);
    }
}
