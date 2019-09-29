public class Nevada extends SlotFactory{
    public SlotMachine makeObj(String item){
        SlotMachine slotmachine = null;
        SlotMachineFactory elementsFactory = null;
        if (item.equals("Straight")){
            elementsFactory = new NevadaStraight();
            slotmachine = new Straight(elementsFactory);
            slotmachine.name = "Nevada Straight";
        }
        else if (item.equals("Bonus")){
            elementsFactory = new NevadaBonus();
            slotmachine = new Bonus(elementsFactory);
            slotmachine.name = "Nevada Bonus";
        }
        else if (item.equals("Progressive")){
            elementsFactory = new NevadaProgressive();
            slotmachine = new Progressive(elementsFactory);
            slotmachine.name = "Nevada Progressive";
        }
        return slotmachine;
    }
}