package br.com.glpontes.PraticaApiRest.math;

import br.com.glpontes.PraticaApiRest.converters.NumberConverter;
import br.com.glpontes.PraticaApiRest.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SimpleMath {
    public Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;

    }

    public Double subtraction(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;

    }

    public Double multiplication(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }

    public Double average(Double numberOne, Double numberTwo){
        return (numberOne + numberTwo) / 2.0;
    }
    public Double squareRoot(Double number){
        return Math.sqrt(number);
    }
}
