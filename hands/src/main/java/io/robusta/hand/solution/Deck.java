package io.robusta.hand.solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

import io.robusta.hand.Card;
import io.robusta.hand.CardColor;
import io.robusta.hand.interfaces.IDeck;

public class Deck extends LinkedList<Card> implements IDeck{

	
	private static final long serialVersionUID = -4686285366508321800L;
	
	public Deck() {

	}
	
	@Override
	public Card pick() {
		
		Collections.shuffle(this);
		Card card = this.get(0);
		this.remove(0);
		return card;
	}

	
	

	@Override
	public TreeSet<Card> pick(int number) {
		
		TreeSet<Card> tree = new TreeSet<Card>();
		for(int i = 0; i<number; i++)
		{
			tree.add(this.pick());
		}
		return tree;
	}

	@Override
	public Hand giveHand() {
		
		Hand hand = new Hand();
		hand.addAll(this.pick(5));
		return hand;
	}	
}
