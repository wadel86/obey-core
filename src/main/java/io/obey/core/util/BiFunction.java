package io.obey.core.util;

@FunctionalInterface
public interface BiFunction<T1, T2, R> {
    public R apply(T1 t1, T2 t2);
}
