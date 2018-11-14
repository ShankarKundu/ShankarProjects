package com.example.vavrseitherexample;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.vavrseitherexample.nt.MarkTest;
import io.vavr.control.Either;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VavrsEitherExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(VavrsEitherExampleApplication.class, args);

		Either<String,Integer> ret=MarkTest.computeWithorEither(80);
		System.out.println(ret.left().get());
		//System.out.println(ret.left().get());
		System.out.println(ret.right());
		System.out.println(ret.left());
		System.out.println("isLeft "+ret.isLeft());
		System.out.println("isRight "+ret.isRight());
		System.out.println("Contains "+ret.contains(85));

		Either<String,Integer> newEith=Either.right(42);

		String res=newEith.fold(i ->i, Object::toString);
		System.out.println(res);

		Either<Integer,String> swap=newEith.swap();
		System.out.println("swap "+swap.right());
		System.out.println("swap "+swap.left());
		//create Right projection





	}
}
