package eu.nsjg.programmingitems.complex;

import java.util.List;

public abstract class ComplexProgrammingItemStrategy {

	protected final Integer[] numbers;

	public ComplexProgrammingItemStrategy(List<Integer> numbers) {
		this.numbers = numbers.toArray(new Integer[numbers.size()]);
	}

	public abstract List<Integer> sort();
	
	protected boolean greater(int i, int j) {
		return numbers[i] > numbers[j];
	}
	
	protected void swap(int i, int j) {
		Integer p = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = p;
	}
}
