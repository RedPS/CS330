public class Washington extends SlotFactory{
    public SlotMachine makeObj(String item){
        SlotMachine slotmachine = null;
        SlotMachineFactory elementsFactory = null;
        if (item.equals("Straight")){
            elementsFactory = new WashingtonStraight();
            slotmachine = new Straight(elementsFactory);
            slotmachine.name = "Washington Straight";
        }
        else if (item.equals("Bonus")){
            elementsFactory = new WashingtonBonus();
            slotmachine = new Bonus(elementsFactory);
            slotmachine.name = "Washington Bonus";
        }
        else if (item.equals("Progressive")){
            elementsFactory = new WashingtonProgressive();
            slotmachine = new Progressive(elementsFactory);
            slotmachine.name = "Washington Progressive";
        }
        return slotmachine;
    }
}