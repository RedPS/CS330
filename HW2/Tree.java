public abstract class Tree {
    String description = "";
    static boolean StarPresent;
    double cost;
    public void setStar(){ 
        StarPresent = true;
    }
    public boolean getStar(){
        return StarPresent;
    }
    public String printtree(){
        return description;
    }
    public abstract double Cost();
}