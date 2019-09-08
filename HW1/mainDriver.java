//main driver to run and test the game 
public class mainDriver{
    public static void main(String[] args){
        /********************
                PLAYER 1
        *********************/
        //create the order 
        orders order_for_grunt = new gruntAttack();

        //create the weapon 
        weapons weapon_for_grunt = new gruntAxe();

        //create the character using the order and weapon 
        characters player1 = new grunt(order_for_grunt,weapon_for_grunt);
        
        //execute the order 
        player1.performOrder();

        //pick up the weapon and use it 
        player1.pickupWeapon();

        //create a new weapon
        weapon_for_grunt = new gruntPistol();

        //switch to that new weapon
        player1.chooseWeapon(weapon_for_grunt);

        //execute the order 
        player1.performOrder();

        //pick up the weapon and use it 
        player1.pickupWeapon();

        /********************
                PLAYER 2
        *********************/
    
        //create the order 
        orders order_for_tank = new tankDefend();

        //create the weapon 
        weapons weapon_for_tank = new tankLaser();

        //create the character using the order and weapon 
        characters player2 = new tank(order_for_tank,weapon_for_tank);
        
        //execute the order 
        player2.performOrder();

        //pick up the weapon and use it 
        player2.pickupWeapon();

        //create a new weapon
        weapon_for_tank = new tankRocket();

        //switch to that new weapon
        player2.chooseWeapon(weapon_for_tank);

        //execute the order 
        player2.performOrder();

        //pick up the weapon and use it 
        player2.pickupWeapon();

    }
}