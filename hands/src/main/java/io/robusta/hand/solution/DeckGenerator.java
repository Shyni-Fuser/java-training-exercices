package io.robusta.hand.solution;

import io.robusta.hand.Card;
import io.robusta.hand.CardColor;
import io.robusta.hand.interfaces.IDeckGenerator;

public class DeckGenerator implements IDeckGenerator {

	@Override
	public Deck generate() {

		Deck deck = new Deck();
		int j = 0;

		for (int i = 1; i <= 52; i++) {
			
			if (i % 13 == 1) {
				j++;
			}
			Card card = new Card(i % 13, CardColor.getByValue(j));
			
			deck.add(card);
		}
		return deck;
	}

}
