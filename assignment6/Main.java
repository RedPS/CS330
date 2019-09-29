public class Main {

    public static void main(String[] args) {
        SlotFactory NV = new Nevada();
        SlotMachine slotmachine;
        slotmachine = NV.makeObj("Straight");
        slotmachine.prepare();
        slotmachine.PrintOrder();
    }

}
