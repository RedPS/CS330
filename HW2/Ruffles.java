public class Ruffles extends Decorations {
    public Ruffles(Tree t) {
        this.tree = t;
    }
    public String printtree() {
        return tree.printtree() + ", Ruffles";
    }
    public double Cost(){
        return tree.Cost() + 1;
    }

}