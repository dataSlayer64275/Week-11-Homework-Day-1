public class Calculator {

    public Calculator(){}

    public int Add(int a, int b) {
        return a + b;
    }

    public int Subtract(int a, int b) {
        return a - b;
    }

    // Why do arguments have to be double, is it possible to just specify result as double
    public double Divide(double a, double b){
        return a/b;
    }

    public int Multiply(int a, int b){
        return a * b;
    }
}

