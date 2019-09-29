public class NevadaStraight implements SlotMachineFactory {
    public Cabinet createCabinet(){
        return new largeCabinet();
    }
    public Payment createPayment(){
        return new ticketinticketoutPayment();
    }
    public Display createDisplay(){
        return new reelsDisplay();
    }
    public GPU createGPU(){
        return new ARMGPU();
    }
    public OS createOS(){
        return new LinuxOS();
    }
}
