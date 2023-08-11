package interfaceConcept;

public abstract class WhatsappV1 {

	public static void install() {
		System.out.println("Installing whatsapp");
	}
	
	public void sendMessage() {
		System.out.println("Hey there i am using whatsapp");
	}
	
	public abstract void sendVoiceNotes();
}
