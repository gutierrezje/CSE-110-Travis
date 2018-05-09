package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Fahrenheit((this.getValue() - 32.0f)/1.8f);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}