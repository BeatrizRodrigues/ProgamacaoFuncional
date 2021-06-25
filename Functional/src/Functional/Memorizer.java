package Functional;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memorizer <T, U> {

	  private final Map<T, U> cache = new ConcurrentHashMap<>();

	  private Memorizer() {}

	  private Function<T, U> compute(final Function<T, U> funcao) {
		  return input -> cache.computeIfAbsent(input, funcao::apply);
	  }

	  public static <T, U> Function<T, U> memo(final Function<T, U> function) {
		  return new Memorizer<T, U>().compute(function);
	  }
}
