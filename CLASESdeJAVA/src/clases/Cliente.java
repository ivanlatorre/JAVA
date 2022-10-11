package clases;

public class Cliente extends Persona{

	private int nroCBu;

	public Cliente(int nroCBu) {
		
		this.nroCBu = nroCBu;
	}

	public Cliente() {
		
	}

	public int getNroCBu() {
		return nroCBu;
	}

	public void setNroCBu(int nroCBu) {
		this.nroCBu = nroCBu;
	}		
}
