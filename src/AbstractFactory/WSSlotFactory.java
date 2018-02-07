package lab4_abstractFactory;

public class WSSlotFactory extends SlotFactory {
    protected Slot makeSlot(String item) {
        Slot slot=null;
        SlotComponentFactory componentFactory = new WSSlotComponentFactory();
        if (item.equals("bonus")) {
            slot=new BonusSlot(componentFactory);
            slot.setName("Washington Style Bonus Slot");
        }
        else if (item.equals("progressive")) {
            slot=new ProgressiveSlot(componentFactory);
            slot.setName("Washington Style Progressive Slot");
        }

        return slot;
    }
}
