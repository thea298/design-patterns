package structural.adapter;

//service
public class TeaInfuser implements TeaBag{
    private TeaLeaf teaLeaf;

    public TeaInfuser(TeaLeaf teaLeaf){
        this.teaLeaf=teaLeaf;
    }

    @Override
    public void steep() {
        System.out.println("using the tea infuser.");
        this.teaLeaf.soak();
    }
    
}
