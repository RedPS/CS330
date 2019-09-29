public class Straight extends SlotMachine{
    SlotMachineFactory elementsFactory;
    public Straight (SlotMachineFactory elementsFactory){
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