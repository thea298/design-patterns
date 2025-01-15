package structural.adapter;

public class Demo {
    public static void main(String[] args) {
        TeaBag tea=new TeaInfuser(new TeaLeaf());
        tea.steep();
    }
}
