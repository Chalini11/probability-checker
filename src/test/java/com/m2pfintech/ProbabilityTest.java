package com.m2pfintech;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
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
        Probability probabilityOfGettingOneWhenRollingADice = new Probability(0.16);

        assertThat(probabilityOfGettingOneWhenRollingADice ,is(not(equalTo(probabilityOfGettingATail))));
    }


    @Test
    void toReturnOneIfTwoEventsAreCertainToHappenTogether()
    {
        Probability probabilityOfEventOneHappening = new Probability(1);
        Probability probabilityOfEventTwoHappening = new Probability(1);
        int one = 1;
        assertThat(one ,is(equalTo(probabilityOfEventTwoHappening.isCertain(probabilityOfEventOneHappening))));

    }

    @Test
    void toReturnOneIfTwoEventsAreNotCertainToHappenTogether()
    {
        Probability probabilityOfEventOneHappening = new Probability(1);
        Probability probabilityOfEventTwoHappening = new Probability(0);
        int one = 1;
        assertThat(one ,is(not(equalTo(probabilityOfEventTwoHappening.isCertain(probabilityOfEventOneHappening)))));

    }
    @Test
    void toReturnEqualityWhenTwoIndependentOccur()
    {
        Probability probabilityOfGettingATail = new Probability(0.5);
        Probability probabilityOfGettingOneWhenRollingADice = new Probability(0.16);
        Probability probabilityOfIndependentEvent = new Probability(0.08);
        assertThat(probabilityOfIndependentEvent,is(equalTo(
                probabilityOfGettingATail.multiply(probabilityOfGettingOneWhenRollingADice))));
    }
}
