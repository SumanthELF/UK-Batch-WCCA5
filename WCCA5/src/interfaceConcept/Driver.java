package interfaceConcept;

public class Driver {
	
	public static void main(String[] args) {
		WhatsappV1 v1 = new WhatsappV2();
		v1.install();   // static_hiding/ method_shadowing
		v1.sendMessage();
		v1.sendVoiceNotes();
	}
}
