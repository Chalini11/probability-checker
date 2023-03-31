package com.m2pfintech;

public class Probability
{


    private final double probability;
    Probability(double probability)
    {
        this.probability = probability;
    }


    @Override
    public boolean equals(Object object)
    {

        if(this == object)
            return true;
        if(object==null || object.getClass() != this.getClass())
            return false;

        return (probability == ((Probability) object).probability);



    }

    public Object multiply(Probability eventTwo)
    {
        double value = eventTwo.probability * probability;
        return new Probability(value);
    }

    public int isCertain(Probability anotherEvent)
    {
        if(probability == 1 && anotherEvent.probability==1)
            return 1;
        return 0;
    }
}
