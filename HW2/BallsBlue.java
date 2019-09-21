public class BallsBlue extends Decorations {
    public BallsBlue(Tree t) {
        this.tree = t;
    }
    public String printtree() {
        return tree.printtree() + ", Blue Ball";
    }
    public double Cost(){
        return tree.Cost() + 2;
    }

}