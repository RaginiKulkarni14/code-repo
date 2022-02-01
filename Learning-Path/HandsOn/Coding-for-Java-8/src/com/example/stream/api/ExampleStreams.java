package com.example.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExampleStreams {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(4);
		al.add(2);
		al.add(7);
		al.add(3);

		// public interface Predicate<T> {

		/**
		 * Evaluates this predicate on the given argument.
		 *
		 * @param t the input argument
		 * @return {@code true} if the input argument matches the predicate, otherwise
		 *         {@code false}
		 */
		// boolean test(T t);
		Predicate<Integer> p = t -> t % 2 == 0;

		System.out.println(p.test(4));

		// Stream<T> filter(Predicate<? super T> predicate);
		al.stream().filter(k -> k % 2 == 0).forEach(t -> System.out.println(t));

//************************************************************************************************************************************\

		//public interface Function<T, R> {

		    /**
		     * Applies this function to the given argument.
		     *
		     * @param t the function argument
		     * @return the function result
		     */
		   // R apply(T t);

		
		Function<Integer, Integer> f1 = i -> i * 2;
		Function<Integer, Integer> f2 = i -> i * 4;

		System.out.println(f1.apply(2));
		System.out.println(f1.andThen(f2).apply(3));
		System.out.println(f1.compose(f2).apply(1));

//************************************************************************************************************************************\

		// public interface Consumer<T> {

		/**
		 * Performs this operation on the given argument.
		 *
		 * @param t the input argument
		 */
		
		//supplier is a method that returns a value its get()
		
		//A Consumer is a functional interface that accepts a single input and returns no output
		
		// void accept(T t);
		// void forEach(Consumer<? super T> action);
		al.stream().forEach(t -> System.out.println(t));

	}

}