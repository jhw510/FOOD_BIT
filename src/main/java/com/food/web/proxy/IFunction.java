package com.food.web.proxy;

import java.util.function.Predicate;
@FunctionalInterface
public interface IFunction<T,R> {

    public R apply(T t);

}
