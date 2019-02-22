package debug.voiture;

public class Voiture {
	
	private String marque;

	public Voiture(String marque) {
		this.marque = marque;
	}
	
	public String getMarque() {
		return marque;
	}
	
	public String roule() {
		return "vroum";
	}
	

}
