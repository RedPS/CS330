public class Bonus extends SlotMachine{
    SlotMachineFactory elementsFactory;
    public Bonus(SlotMachineFactory elementsFactory){
        this.elementsFactory = elementsFactory;
    }
    void prepare(){
        System.out.println("Making a " + name);
        cabinet = elementsFactory.createCabinet();
        payment = elementsFactory.createPayment();
        display = elementsFactory.createDisplay();
        gpu = elementsFactory.createGPU();
        os = elementsFactory.createOS();
    }
}