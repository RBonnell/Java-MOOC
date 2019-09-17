package validation;

public class Calculator {

    public int multiplication(int fromInteger) {

        if (fromInteger < 0){
            throw new IllegalArgumentException("Argument factor must be greater than 0");
        }
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        
        if (subsetSize < 0 || setSize < 0){
            throw new IllegalArgumentException("Set sizes must be greater than 0");
        }
        if (subsetSize > setSize){
            throw new IllegalArgumentException("Subset size cannot exceed set size");
        }
        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
