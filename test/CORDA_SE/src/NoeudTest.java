import static org.junit.Assert.*;

import org.junit.Test;


public class NoeudTest {
	/**
	 * Test method for {@link Noeud#getPere()}
	 */
	@Test
	public void testGetPere(){
		Noeud n=new Noeud(13);
		assertEquals(null, n.getPere());
		Noeud p=new Noeud(14);
		n.setPere(p);
		assertEquals(p,n.getPere());
	}
	
	/**
	 * Test method for {@link Noeud#getValeur()}
	 */
	@Test
	public void testGetValeur(){
		Noeud n=new Noeud(13);
		assertEquals(13,n.getValeur());
	}
	
	/**
	 * Test method for {@link Noeud#getL_fils()}
	 */
	@Test
	public void testGetL_fils(){
		Noeud n=new Noeud(12);
		Noeud p=new Noeud(13);
		p.setL_fils(n);
		assertEquals(n,p.getL_fils());
	}
	/**
	 * Test method for {@link Noeud#getR_fils()}
	 */
	@Test
	public void testGetR_fils(){
		Noeud n=new Noeud(12);
		Noeud p=new Noeud(13);
		p.setR_fils(n);
		assertEquals(n,p.getR_fils());
	}
}
