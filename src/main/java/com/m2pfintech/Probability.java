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
}
