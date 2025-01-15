package exercises.chap4_ex2;

//bridge:concrete implementation
public class ScreenRenderer implements Renderer{

    @Override
    public void renderImage(String imagePath) {
        System.out.println("Rendering image on screen "+imagePath);
    }

    @Override
    public void renderShape(String shapeType) {   
        System.out.println("Rendering shape on screen "+shapeType);
    }

    @Override
    public void renderText(String text) {
        System.out.println("Rendering text on screen "+text);
    }
    
}
