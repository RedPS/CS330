public class Lights extends Decorations {
    public Lights(Tree t) {
        this.tree = t;
    }
    public String printtree() {
        return tree.printtree() + ", Lights";
    }
    public int Cost(){
        return tree.Cost() + 5;
    }

}