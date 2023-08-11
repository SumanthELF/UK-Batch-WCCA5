package abstractionConcept;

public abstract class Whatsapp {

	public void sendMessage(String text) {
		System.out.println("sending "+ text);
	}
	
	public abstract void sendMessage(Image images);
	
	public abstract void sendMessage(Voicenotes audio);
}
