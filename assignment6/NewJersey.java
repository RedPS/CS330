public class NewJersey extends SlotFactory{
    public SlotMachine makeObj(String item){
        SlotMachine slotmachine = null;
        SlotMachineFactory elementsFactory = null;
        if (item.equals("Straight")){
            elementsFactory = new NewJerseyStraight();
            slotmachine = new Straight(elementsFactory);
            slotmachine.name = "NewJersey Straight";
        }
        else if (item.equals("Bonus")){
            elementsFactory = new NewJerseyBonus();
            slotmachine = new Bonus(elementsFactory);
            slotmachine.name = "NewJersey Bonus";
        }
        else if (item.equals("Progressive")){
            elementsFactory = new NewJerseyProgressive();
            slotmachine = new Progressive(elementsFactory);
            slotmachine.name = "NewJersey Progressive";
        }
        return slotmachine;
    }
}