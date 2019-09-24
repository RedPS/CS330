public class Star extends Decorations {
    public Star(Tree t) {
        this.tree = t;
        if(this.tree.getStar()){
            System.out.println("Tree Already has a star!");
        }else {
            this.tree.description += ", a star";
            this.tree.cost += 4;
        }
        this.tree.setStar(); 
    }
    public String printtree(){
        return tree.printtree();
    }
    public double Cost(){
        return tree.Cost();
    }
}