/**
 * 
 */

/**
 * @author Mirnes Sabaredzovic
 *
 */
public class Ansatt {
	
	private String navn;
	private String etternavn;
	private String kjonn;
	private String stilling;
	private int aarslonn;
	
	
	public Ansatt(String navn, String etternavn, String kjonn, String stilling, int aarslonn) {
		this.navn = navn;
		this.etternavn = etternavn;
		this.kjonn = kjonn;
		this.stilling = stilling;
		this.aarslonn = aarslonn;	
	}

	
	
	
	
	/**
	 * En generell metode for å endre lønnen til en ansatt. 
	 * 
	 * La parameteren til endreLonn(...) være av typen Function<Integer, Integer> (f(gammel lønn) = ny lønn).
	 * Dette tilsvarer om du selv hadde definert en funksjonell kontrakt med metoden Integer m(Integer x).
	 * 
	 */
	
	
	//TODO
	public void endreLonn() {
		
	}
	
	
	
	
	
	public String getNavn() {
		return navn;
	}


	public void setNavn(String navn) {
		this.navn = navn;
	}


	public String getEtternavn() {
		return etternavn;
	}


	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}


	public String getKjonn() {
		return kjonn;
	}


	public void setKjonn(String kjonn) {
		this.kjonn = kjonn;
	}


	public String getStilling() {
		return stilling;
	}


	public void setStilling(String stilling) {
		this.stilling = stilling;
	}


	public int getAarslonn() {
		return aarslonn;
	}


	public void setAarslonn(int aarslonn) {
		this.aarslonn = aarslonn;
	}
	
	
	
	
	
	
	
	
	
	

}
