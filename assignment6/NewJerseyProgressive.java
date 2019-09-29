public class NewJerseyProgressive implements SlotMachineFactory {
    public Cabinet createCabinet(){
        return new smallCabinet();
    }
    public Payment createPayment(){
        return new billsPayment();
    }
    public Display createDisplay(){
        return new CRTDisplay();
    }
    public GPU createGPU(){
        return new X86GPU();
    }
    public OS createOS(){
        return new XPOS();
    }
}
