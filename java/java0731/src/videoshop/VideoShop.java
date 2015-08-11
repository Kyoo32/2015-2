package videoshop;

public class VideoShop extends Shop implements IQueue {

	@Override
	public void enQueue(String title) {
		
		shelf.add(title);
	}

	@Override
	public String deQueue() {

		return shelf.remove(0);
	}

}
