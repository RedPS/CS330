## Important notes about the mainDriver interface
    Please note that I am not making the program initialize anything with the default contructor
    since I have no idea what the  players should have as an initial value (should their order be to attack or defend or etc. should their weapon be an Axe, a pistol or etc.)
    so I just have a parameterized contructor instead and I am letting the user (the programmer) take care of the initial values but they are welcome to change them at anytime.
## important notes about implementation 
    the asssignment description was a little vague about what we needed, so I just went with what the book covered, but personally
    I think there should've been an orderChange(), just like the weaponChange and pickup_newweapon() and many other useful methods. 
    Not implementing them came from the fact that of personal interpretation of the assignment description, if needed please let 
    me know and those functions can be added easily.

# Resposes to Question 3

## OOP Justification

### Encapsulation
    We have encapsulated a family of algorithms and we select one from the pool for use during runtime.
    Each set of behavior can be thought as a family of algorithms.
    so they can be seen in

    order -> grutAttack.java gruntFlee.java tankAttack.java tankDefend.java tankSelfDestruct.java
    weapons -> gruntAxe.java gruntPistol.java tankCanon.java tankLaser.java tankRocket.java

### Inheritance
    relationship between classes
    reusibility

    This can be seen in our abstract character ckass to our orders and weapons interfaces, it can also be seen from our interfaces
    to their respective behavior algorithms.

    -refer to the class diagram for further reference.

### Polymorthism
    Single form but many different implementations ways.
    Single behavior, like executeOrder(), useWeapon(), in different ways.
    These can be viewed in all of our "family" of algorithms.
