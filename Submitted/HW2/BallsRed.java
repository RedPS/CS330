public class BallsRed extends Decorations {
    public BallsRed(Tree t) {
        this.tree = t;
    }
    public String printtree() {
        return tree.printtree() + ", Red Ball";
    }
    public double Cost(){
        return tree.Cost() + 1;
    }

}