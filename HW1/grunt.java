public class grunt extends characters {
    public grunt (){
    }
    public grunt (orders theOrder, weapons theWeapon){
        GameOrder = theOrder;
        GameWeapons = theWeapon;
    }
    public void display(){
        System.out.println("grunt");
    }
}