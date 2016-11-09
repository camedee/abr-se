

import static org.junit.Assert.*;

import org.junit.Test;




public class ABRTest {
	/**
	 * Test method for {@link ABR#isEmpty()}.
	 */
	@Test
	public void testIsEmpty(){
		ABR a=new ABR();
		assertTrue(a.isEmpty());
		Noeud n=new Noeud(13);
		a.insert(n);
		assertFalse(a.isEmpty());
	}
	
	/**
	 * Test method for {@link ABR#nbElements()}.
	 */
	@Test
	public void testNbElements(){
		ABR a=new ABR();
		assertEquals(0,a.nbElements());
		Noeud n=new Noeud(13);
		a.insert(n);
		n=new Noeud(15);
		a.insert(n);
		n=new Noeud(5);
		a.insert(n);
		n=new Noeud(14);
		a.insert(n);
		n=new Noeud(19);
		a.insert(n);
		n=new Noeud(20);
		a.insert(n);
		n=new Noeud(17);
		a.insert(n);
		n=new Noeud(12);
		a.insert(n);
		n=new Noeud(144);
		a.insert(n);
		n=new Noeud(3);
		a.insert(n);
		assertEquals(10,a.nbElements());
	}
	
	/**
	 * Test method for {@link ABR#toList(java.util.List<java.lang.Integer> l)}.
	 */
	@Test
	public void testToList(){
		ABR a=new ABR();
		Noeud n=new Noeud(13);
		a.insert(n);
		n=new Noeud(15);
		a.insert(n);
		n=new Noeud(5);
		a.insert(n);
		n=new Noeud(14);
		a.insert(n);
		n=new Noeud(19);
		a.insert(n);
		n=new Noeud(20);
		a.insert(n);
		n=new Noeud(17);
		a.insert(n);
		n=new Noeud(12);
		a.insert(n);
		n=new Noeud(144);
		a.insert(n);
		n=new Noeud(3);
		a.insert(n);
		java.util.List<java.lang.Integer> l = null;
		a.toList(l);
		assertEquals(10,l.size());
	}

}
