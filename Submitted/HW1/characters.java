//abstract class for characters 
public abstract class characters{
   
    orders GameOrder;
    weapons GameWeapons;
    
    public characters() {
    }
    public abstract void display();

    public void performOrder(){
        GameOrder.executeOrder();
    }

    public void pickupWeapon(){
        GameWeapons.useWeapon();
    }

    //set order 
    public void giveOrder(orders orderCommand){
        GameOrder = orderCommand;
    }
    //set the weapon
    public void chooseWeapon(weapons pickWeapon){
        GameWeapons = pickWeapon;
    }
     
}
