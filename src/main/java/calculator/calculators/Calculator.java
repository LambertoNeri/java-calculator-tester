package calculator.calculators;

import calculator.exceptions.DivideBy0Exception;

public interface Calculator {
    // VALORI

    // METODI
    static float floatAdd(float float1, float float2) {
        return float1 + float2;
    }

    static float floatSubtract(float float1, float float2) {
        return float1 - float2;
    }

    static float floatDivide(float float1, float float2) throws DivideBy0Exception {
        if( float2 == 0 ) {
            throw new DivideBy0Exception();
        }
        return float1 / float2;
    }

    static float floatMultiply(float float1, float float2){
        return float1 * float2;
    }
}
