package com.example.vavrseitherexample.nt;

import io.vavr.control.Either;

public class MarkTest {

    public static Either<String,Integer> computeWithorEither(int mark) {
        if(mark<85){
            return Either.left("marks not acceptable");
        }
        else {
            return Either.right(mark);
        }
    }
}
