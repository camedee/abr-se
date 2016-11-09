
public class Noeud {
	private int valeur;
	private Noeud pere;
	private Noeud l_fils;
	private Noeud r_fils;
	
	public Noeud(int value){
		this.valeur=value;
		this.pere=null;
		this.l_fils=null;
		this.r_fils=null;
	}
	
	public Noeud(int value,Noeud pere, Noeud l_fils, Noeud r_fils){
		this.valeur=value;
		this.pere=pere;
		this.l_fils=l_fils;
		this.r_fils=r_fils;
	}
	
	public Noeud getPere(){
		return this.pere;
	}
	
	public int getValeur(){
		return this.valeur;
	}
	
	public Noeud getL_fils(){
		return this.l_fils;
	}
	
	public Noeud getR_fils(){
		return this.r_fils;
	}
	
	public void setPere(Noeud pere){
		assert this.pere==null;
		this.pere=pere;
	}
	public void setL_fils(Noeud pere){
		assert this.l_fils==null;
		this.l_fils=pere;
	}
	public void setR_fils(Noeud pere){
		assert this.r_fils==null;
		this.r_fils=pere;
	}
	
	
}
