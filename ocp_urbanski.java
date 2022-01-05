package edu.agh.wfiis.solid.ocp.example2;

interface CalculatorOperation
{
    int operation(int val1, int val2);
};

class Add implements CalculatorOperation
{
    public int operation(int val1, int val)
    {
        int result=val1+val2;
        System.out.println(result);
        return result;
    }
}

class Subtract implements CalculatorOperation
{
    public int operation(int val1, int val)
    {
        int result=val1-val2;
        System.out.println(result);
        return result;
    }
}

public class Calculator
{
    public int calculate(String[] args)
    {
        int val1 = Integer.valueOf(args[0]);
        int val2 = Integer.valueOf(args[2]);
        String operator = args[1];

        ///
    }

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        calculator.calculate(args);
    }
}
