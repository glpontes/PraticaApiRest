package br.com.glpontes.PraticaApiRest.controller;

import br.com.glpontes.PraticaApiRest.converters.NumberConverter;
import br.com.glpontes.PraticaApiRest.exceptions.UnsupportedMathOperationException;
import br.com.glpontes.PraticaApiRest.math.SimpleMath;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private SimpleMath math = new SimpleMath();
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
            method= RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
        ) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.sum(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));

    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}",
        method= RequestMethod.GET)
    public Double subtraction(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.subtraction(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));

    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}",
            method= RequestMethod.GET)
    public Double multiplication(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.multiplication(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));

    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}",
            method= RequestMethod.GET)
    public Double division(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.division(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));

    }

    @RequestMapping(value = "/average/{numberOne}/{numberTwo}",
            method= RequestMethod.GET)
    public Double average(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return math.average(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));

    }

    @RequestMapping(value = "/squareRoot/{number}",
            method=RequestMethod.GET)
    public Double squareRoot(
            @PathVariable(value = "number") String number
        ) throws Exception{
        if (!NumberConverter.isNumeric(number)){
            throw new UnsupportedMathOperationException("Please set a numeric value!");
    }
        return math.squareRoot(NumberConverter.converToDouble(number));
    }
}
