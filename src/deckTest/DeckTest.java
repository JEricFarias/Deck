package deckTest;

import org.junit.Assert;
import org.junit.Test;

import deck.Deck;

public class DeckTest {

	@Test
	public void addValorUnitarioDireita() {
		Deck<Integer> d = new Deck<>();
		d.add(Deck.RIGHT, 23);
		
		Assert.assertEquals(1, d.getSize());
	}
	
	@Test
	public void removeValorUnitarioDireita() {
		Deck<Integer> d = new Deck<>();
		d.add(Deck.RIGHT, 23);
		d.remove(Deck.RIGHT);
		Assert.assertEquals(0, d.getSize());
	}
	
	@Test
	public void removeValorUnitarioTestValueDireita() {
		Deck<Integer> d = new Deck<>();
		d.add(Deck.RIGHT, 23);
		
		Assert.assertEquals(23, d.remove(Deck.RIGHT).intValue());
	}
	
	@Test
	public void addValorUnitarioEsquerda() {
		Deck<Integer> d = new Deck<>();
		d.add(Deck.LEFT, 23);
		
		Assert.assertEquals(1, d.getSize());
	}
	
	@Test
	public void removeValorUnitarioEsquerda() {
		Deck<Integer> d = new Deck<>();
		d.add(Deck.LEFT, 23);
		d.remove(Deck.LEFT);
		Assert.assertEquals(0, d.getSize());
	}
	
	@Test
	public void removeValorUnitarioTestValueEsquerda() {
		Deck<Integer> d = new Deck<>();
		d.add(Deck.RIGHT, 23);
		
		Assert.assertEquals(23, d.remove(Deck.RIGHT).intValue());
	}
	
	@Test
	public void addDireitaTest() {
		Deck<Integer> d = new Deck<>();
		d.add(Deck.RIGHT, 23);
		d.add(Deck.RIGHT, 24);
		
		Assert.assertEquals(2, d.getSize());
	}
	
	@Test
	public void addEsquerdaTest(){
		Deck<Integer> d = new Deck<>();
		d.add(Deck.RIGHT, 23);
		d.add(Deck.RIGHT, 24);
		
		Assert.assertEquals(2, d.getSize());
	}
	
	@Test
	public void removeDireitaTest(){
		Deck<Integer> d = new Deck<>();
		d.add(Deck.RIGHT, 23);
		d.add(Deck.RIGHT, 24);
		
		d.remove(Deck.RIGHT);
		System.out.println(d.getSize());
		Assert.assertEquals(1, d.getSize());
	}
	
	@Test
	public void removeEsquerdaTest(){
		Deck<Integer> d = new Deck<>();
		d.add(Deck.RIGHT, 23);
		d.add(Deck.RIGHT, 24);
		
		d.remove(Deck.LEFT);
		
		Assert.assertEquals(1, d.getSize());
	}
	
	@Test
	public void removeDireitaValueTest(){
		Deck<Integer> d = new Deck<>();
		d.add(Deck.RIGHT, 23);
		d.add(Deck.RIGHT, 24);
		d.add(Deck.RIGHT, 25);
		d.add(Deck.RIGHT, 26);
		
		Assert.assertEquals(26, d.remove(Deck.RIGHT).intValue());
	}
	
	@Test
	public void removeEsquerdaValueTest(){
		Deck<Integer> d = new Deck<>();
		d.add(Deck.LEFT, 23);
		d.add(Deck.LEFT, 24);
		d.add(Deck.LEFT, 25);
		d.add(Deck.LEFT, 26);
		
		Assert.assertEquals(26, d.remove(Deck.LEFT).intValue());
	}
	
	

}
