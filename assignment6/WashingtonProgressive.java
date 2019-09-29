public class WashingtonProgressive implements SlotMachineFactory {
    public Cabinet createCabinet(){
        return new largeCabinet();
    }
    public Payment createPayment(){
        return new coinsPayment();
    }
    public Display createDisplay(){
        return new reelsDisplay();
    }
    public GPU createGPU(){
        return new ARMGPU();
    }
    public OS createOS(){
        return new AndroidOS();
    }
}
