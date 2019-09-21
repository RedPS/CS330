public class LED extends Decorations {
    public LED(Tree t) {
        this.tree = t;
    }
    public String printtree() {
        return tree.printtree() + ", LED";
    }
    public int Cost(){
        return tree.Cost() + 10;
    }

}