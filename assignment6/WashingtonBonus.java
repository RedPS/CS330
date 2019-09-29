public class WashingtonBonus implements SlotMachineFactory {
    public Cabinet createCabinet(){
        return new mediumCabinet();
    }
    public Payment createPayment(){
        return new ticketinticketoutPayment();
    }
    public Display createDisplay(){
        return new VGADisplay();
    }
    public GPU createGPU(){
        return new ARMGPU();
    }
    public OS createOS(){
        return new SymbianOS();
    }
}
