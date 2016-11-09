
public class ABR {
	private Noeud root;
	
	public ABR(){
		this.root=null;
	}
	
	public void insert(Noeud noeud){
		if (this.root==null){
			this.root=noeud;
		}else{
			Noeud father=this.root;
			boolean test=false;
			while(!test){
				if (noeud.getValeur()<father.getValeur()){
					if (father.getL_fils()==null){
						test=true;
					}else{
						father=father.getL_fils();
					}
				}else{
					if (father.getR_fils()==null){
						test=true;
					}else{
						father=father.getR_fils();
					}
				}
			}
			if (noeud.getValeur()<father.getValeur()){
				father.setL_fils(noeud);
				noeud.setPere(father);
			}else{
				father.setR_fils(noeud);
				noeud.setPere(father);
			}
		}
	}
	
	public boolean isEmpty(){
		return this.root==null;
	}
	
	public int nbElements(){
		int nbE=0;
		if (this.isEmpty()){
			return nbE;
		}
		Noeud n=this.root;
		return nbElements(n);
	}
	
	public int nbElements(Noeud n){
		int nbE=0;
		if (n.getL_fils()!=null){
			nbE+=nbElements(n.getL_fils());
		}
		nbE+=1;
		if (n.getR_fils()!=null){
			nbE+=nbElements(n.getR_fils());
		}
		return nbE;
	}
	
	public boolean contains(int value){
		if (this.isEmpty()){
			return false;
		}
		Noeud compare=this.root;
		boolean test=false;
		while (!test){
			if (compare.getValeur()==value){
				return true;
			}
			if (compare.getValeur()<value){
				if (compare.getR_fils()!=null){
					compare=compare.getR_fils();
				}else{
					return false;
				}
			}else{
				if (compare.getL_fils()!=null){
					compare=compare.getL_fils();
				}else{
					return false;
				}
			}
		}
		return false;
	}
	
	public void toList(java.util.List<java.lang.Integer> l){
		if (this.isEmpty()){
			return;
		}
		Noeud n=this.root;
		this.toList(l,n);
	}
	
	public void toList(java.util.List<java.lang.Integer> l, Noeud n){
		if (n.getL_fils()!=null){
			this.toList(l, n.getL_fils());
		}
		l.add(n.getValeur());
		if (n.getR_fils()!=null){
			this.toList(l,n.getR_fils());
		}
	}
}
