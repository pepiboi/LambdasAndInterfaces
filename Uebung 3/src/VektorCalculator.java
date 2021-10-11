public class VektorCalculator extends AbstractCalculator{
    public VektorCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation mulitply, CalculationOperation divide) {
        super(add, subtract, mulitply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a,b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return mulitply.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a,b);
    }
}
