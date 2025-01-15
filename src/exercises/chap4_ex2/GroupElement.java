package exercises.chap4_ex2;

import java.util.*;

public class GroupElement implements DocumentElement{
    private List<DocumentElement> elements=new ArrayList<DocumentElement>();

    public void add(DocumentElement element){
        elements.add(element);
    }

    @Override
    public void render(Renderer renderer) {
        for(DocumentElement e:elements){
            e.render(renderer);
        }        
    }
    
}
