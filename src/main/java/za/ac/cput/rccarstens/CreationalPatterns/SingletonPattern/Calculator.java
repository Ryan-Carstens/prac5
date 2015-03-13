package za.ac.cput.rccarstens.CreationalPatterns.SingletonPattern;


public class Calculator {
    private static Calculator calculator = null;

    private Calculator()
    {
    }

    public static Calculator getInstance()
    {
        if (calculator == null)
        {
            calculator = new Calculator();
        }
        return calculator;
    }

    public int add(int a, int b)
    {
        return a + b;
    }

    public int multiply(int a, int b)
    {
        return a * b;
    }

    public int substract(int a, int b)
    {
        return a - b;
    }
}