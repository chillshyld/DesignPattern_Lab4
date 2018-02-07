package lab4_abstractFactory;

public class WSSlotComponentFactory implements SlotComponentFactory {
    public Cabinet createCabinet(){
        return null;
    }

    public Display createDisplay(){
        System.out.print("-----------");
        return null;
    }
}
