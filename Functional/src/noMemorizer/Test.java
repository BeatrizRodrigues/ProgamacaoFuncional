package noMemorizer;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(6);
		int soma = 0, n = 2;
		long start = System.currentTimeMillis();
		
		soma = list.stream().filter(i -> (i%n==0) && (i>0)).reduce(soma, Integer::sum);
		
		System.out.println("Soma: " + soma);
		System.out.println("Tempo de execução: " + (System.currentTimeMillis()-start));
	}
}
