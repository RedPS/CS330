public class NevadaProgressive implements SlotMachineFactory {
    public Cabinet createCabinet(){
        return new mediumCabinet();
    }
    public Payment createPayment(){
        return new ticketinticketoutPayment();
    }
    public Display createDisplay(){
        return new LCDDisplay();
    }
    public GPU createGPU(){
        return new X77GPU();
    }
    public OS createOS(){
        return new AndroidOS();
    }
}
