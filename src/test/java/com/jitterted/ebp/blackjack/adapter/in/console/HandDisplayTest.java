package com.jitterted.ebp.blackjack.adapter.in.console;

import com.jitterted.ebp.blackjack.domain.Card;
import com.jitterted.ebp.blackjack.domain.Hand;
import com.jitterted.ebp.blackjack.domain.Rank;
import com.jitterted.ebp.blackjack.domain.Suit;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class HandDisplayTest {

    @Test
    public void displayFirstCard() throws Exception {
        Hand hand = new Hand(List.of(new Card(Suit.HEARTS, Rank.ACE)));

        assertThat(ConsoleHand.displayFirstCard(hand))
                .isEqualTo("[31m┌─────────┐[1B[11D│A        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        A│[1B[11D└─────────┘");
    }

    @Test
    public void cardsAsStringTransformsWholeHandToDisplayString() throws Exception {
        Hand hand = new Hand(List.of(new Card(Suit.HEARTS, Rank.NINE),
                                     new Card(Suit.SPADES, Rank.THREE)));

        assertThat(ConsoleHand.cardsAsString(hand))
                .isEqualTo("[31m┌─────────┐[1B[11D│9        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        9│[1B[11D└─────────┘[6A[1C[30m┌─────────┐[1B[11D│3        │[1B[11D│         │[1B[11D│    ♠    │[1B[11D│         │[1B[11D│        3│[1B[11D└─────────┘");
    }
}