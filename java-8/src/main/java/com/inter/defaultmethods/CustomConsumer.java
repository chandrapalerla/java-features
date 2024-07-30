package com.inter.defaultmethods;

import java.util.Objects;

@FunctionalInterface
public interface CustomConsumer<T> {

  void accept(T t);

  default CustomConsumer<T> andThen(CustomConsumer<? super T> after) {
    Objects.requireNonNull(after);
    return (T t) -> {
      after.accept(t);
    };
  }

}
