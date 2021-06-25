package Functional;

import java.util.ArrayList;
import java.util.function.Function;

public class Sum {
	int n;
	ArrayList<Integer> list = new ArrayList();
	
	public Sum(int n, ArrayList<Integer> list) {
		this.n = n;
		this.list = list;
	}
	
	Function<Integer, Integer> ver = x -> list.stream().filter(i -> (i%n==0) && (i>0)).reduce(x, Integer::sum);
    
    Function<Integer, Integer> sum = Memorizer.memo(ver);
}
