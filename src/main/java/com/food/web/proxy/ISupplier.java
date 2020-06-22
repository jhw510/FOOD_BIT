package com.food.web.proxy;
@FunctionalInterface
public interface ISupplier<T> {
    public T get();
}
