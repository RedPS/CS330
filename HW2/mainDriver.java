public class mainDriver {

    interface myInterface { 
        void run(); 
    } 
    static void printtree(Tree mytree)
    { 
        myInterface r = new myInterface() { 
            public void run(){
                    System.out.println(mytree.printtree() + " cost $" + mytree.Cost());
            }; 
        }; 
        r.run(); 
    } 
    public static void main(String[] args){
        // code given to us from the description of the project
        Tree mytree = new BlueSpruce();
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        printtree(mytree);
    }
}