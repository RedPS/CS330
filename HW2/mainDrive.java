public class mainDrive {

    public static void main(String[] args){
        // need the below for the print function to work
        mainDrive print = new mainDrive();

        // code given to us from the description of the project
        Tree mytree = new BlueSpruce();
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        System.out.println(mytree.printtree() + " cost " + mytree.Cost());
        // print.printtree(mytree); //had to add the print otherwise it wouldn't work
    }
}