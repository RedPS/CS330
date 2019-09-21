public class BallsSilver extends Decorations {
    public BallsSilver(Tree t) {
        this.tree = t;
    }
    public String printtree() {
        return tree.printtree() + ", Silver Ball";
    }
    public double Cost(){
        return tree.Cost() + 3;
    }

}