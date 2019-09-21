public abstract class Tree {
    String name = "unknown";
    int cost = 0;
    
    public String printtree(){
        return name;
    }
    public abstract int Cost();
}