package Functional;

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
		int n = 2;		
		Sum sum = new Sum(n, list);
		
        System.out.println(sum.sum.apply(0));
	}
}
