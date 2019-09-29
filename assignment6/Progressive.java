public class Progressive extends SlotMachine{
    SlotMachineFactory elementsFactory;
    public Progressive(SlotMachineFactory elementsFactory){
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