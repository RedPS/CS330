public class Ribbons extends Decorations {
    public Ribbons(Tree t) {
        this.tree = t;
    }
    public String printtree() {
        return tree.printtree() + ", Ribbons";
    }
    public int Cost(){
        return tree.Cost() + 2;
    }

}