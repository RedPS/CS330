public abstract class SlotMachine {
    String name;
    Cabinet cabinet;
    Payment payment;
    Display display;
    GPU gpu;
    OS os;

    abstract void prepare();

    public void PrintOrder() {
        System.out.println("fetching components: " + cabinet.toString() + ", " + payment.toString()+ " validator, " + display.toString() + ", " + gpu.toString());
        System.out.println("assembling components");
        System.out.println("testing hardware");
        System.out.println("uploading software: " + os.toString());
        System.out.println("testing software");
        System.out.println("packaging parts so the UPS guys can drop it");
    }
}
