public class Star extends Decorations {
    public Star(Tree t) {
        this.tree = t;
    }

    public String printtree() {
        return tree.printtree() + ",a Star";
    }
    public int Cost(){
        return tree.Cost() + 4;
    }
}