package lab4_abstractFactory;

public class NJSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new smallCabinet();
	}
	public Display createDisplay() {
		return new Reels();
	}
}
