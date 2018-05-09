package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Celsius(this.getValue() * 1.8f + 32.0f);
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}