package com.m2pfintech;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class ProbabilityTest
{

    @Test
    void toReturnEqualityWhenCoinTossedOnce()
    {
        Probability probabilityOfGettingATail = new Probability(0.5);
        Probability probabilityOfGettingAHead = new Probability(0.5);

        assertThat(probabilityOfGettingAHead ,is(equalTo(probabilityOfGettingATail)));
    }

    @Test
    void toReturnEqualityWhenADiceIsRolledAndACoinIsTossed()
    {
        Probability probabilityOfGettingATail = new Probability(0.5);
        Probability probabilityOfGettingOneWhenRollingADice = new Probability(0.5);

        assertThat(probabilityOfGettingOneWhenRollingADice ,is(equalTo(probabilityOfGettingATail)));
    }
}
