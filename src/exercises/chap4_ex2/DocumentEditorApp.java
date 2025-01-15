package exercises.chap4_ex2;

public class DocumentEditorApp {
    public static void main(String[] args) {
        DocumentElement text1=new Text("Hello everyone!"); 
        DocumentElement text2=new Text("Design patterns are great!");
        DocumentElement image=new Image("dp.png"); 
        DocumentElement shape=new Shape("Square");

        GroupElement group=new GroupElement();
        group.add(text1);
        group.add(image);

        GroupElement nestedGroup=new GroupElement();
        nestedGroup.add(text2);
        nestedGroup.add(shape);
        nestedGroup.add(group);

        Renderer screenRenderer=new ScreenRenderer();
        Renderer pdfRenderer=new PdfRenderer();
        nestedGroup.render(screenRenderer);
        nestedGroup.render(pdfRenderer);
    }
}
