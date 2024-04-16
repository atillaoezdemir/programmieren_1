package klausursuebungen;

public class sft {

	int nummer;
	String openclose;
	
	public sft(int nummer, String openclose) {
		this.nummer = nummer;
		this.openclose = openclose;
	}
	
	public String toString(String openclose) {
		String situation;
		
		if(openclose == "o") 
			situation = "offen";

		else if(openclose == "z") 

			situation = "zu";

		else 
			situation = "-1";
		
		return situation;
	}
	
	public int getNummer() {
		return this.nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	
	public String getOpenclose() {
		return this.openclose;
	}
	
	public void setOpenclose(String openclose) {
		this.openclose = openclose;
	}
}
