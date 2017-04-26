package com.example.streams;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by mrpehlivan on 26/04/2017.
 *
 * IntegerStreamExample
 */
public class IntegerStreamExample {

    public IntStream rangeAndFindSquareOfNumbersExample(int start , int stop){
       return  IntStream.range(start,stop).map(i-> i*i);
    }

    public IntStream rangeClosedAndFindSquareOfNumbersExample(int start , int stop){
        return  IntStream.rangeClosed(start,stop).map(i-> i*i);
    }

    public IntStream concatNumbersExample(int start , int stop){
        return  IntStream.concat(IntStream.of(start),IntStream.of(stop));
    }

    public IntStream iterateNumbersByOperationAddExample(int start,int limit){
        return  IntStream.iterate(start, i-> i+2).limit(limit);
    }

    public boolean anyMatchNumbersExample(int start,int stop){
        return  IntStream.rangeClosed(start,stop).anyMatch(i-> i%2==0);
    }

    public boolean allMatchNumbersExample(int start,int stop){
        return  IntStream.rangeClosed(start,stop).allMatch(i-> i%2==0);
    }

    public boolean noneMatchNumbersExample(int start,int stop){
        return  IntStream.rangeClosed(start,stop).noneMatch(i-> i%2==0);
    }

    public int maxNumberExample(int start,int stop){
        return  IntStream.rangeClosed(start,stop).max().getAsInt();
    }

    public int minNumberExample(int start,int stop){
        return  IntStream.rangeClosed(start,stop).min().getAsInt();
    }

    public int sumNumberExample(int start,int stop){
        return  IntStream.rangeClosed(start,stop).sum();
    }

    public double averageOfNumbersExample(int start,int stop){
        return  IntStream.rangeClosed(start,stop).average().getAsDouble();
    }


}
