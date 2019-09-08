public class tank extends characters {
    public tank (){
    }
    public tank (orders theOrder, weapons theWeapon){
        GameOrder = theOrder;
        GameWeapons = theWeapon;
    }
    public void display(){
        System.out.println("tank");
    }
}