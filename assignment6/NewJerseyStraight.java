public class NewJerseyStraight implements SlotMachineFactory {
    public Cabinet createCabinet(){
        return new smallCabinet();
    }
    public Payment createPayment(){
        return new coinsPayment();
    }
    public Display createDisplay(){
        return new LCDDisplay();
    }
    public GPU createGPU(){
        return new ARMGPU();
    }
    public OS createOS(){
        return new MEOS();
    }
}
