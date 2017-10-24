package eu.nsjg.programmingitems;

import java.util.List;
import java.util.Random;

import eu.nsjg.programmingitems.complex.BubbleSort;
import eu.nsjg.programmingitems.complex.ComplexProgrammingItemStrategy;
import eu.nsjg.programmingitems.complex.SimpleShuffleSort;
import eu.nsjg.programmingitems.generate.ListPopulate;
import eu.nsjg.programmingitems.simple.SimpleItemResult;

public class App {

	private final List<Integer> numbers;
	private final SimpleItemResult item;

	public App() {
		ListPopulate list = new ListPopulate(new Random());
		numbers = list.getNumbers(100, 1, 100);
		item = new SimpleItemResult();
	}

	public static void main(String[] args) {
		App app = new App();
		app.print();
	}

	private void print() {
		System.out.println("A lista jelenleg " + numbers.size() + " elemû.");
		System.out.println("A lista tartalma: " + numbers);
		System.out.println(item.getResult(numbers, 0));
		System.out.println("------");
		ComplexProgrammingItemStrategy complex = new SimpleShuffleSort(numbers);
		System.out.println("A lista tartalma: " + numbers);
		System.out.println("A lista rendezve: " + complex.sort());
		System.out.println("------");
		complex = new BubbleSort(numbers);
		System.out.println("A lista tartalma: " + numbers);
		System.out.println("A lista rendezve: " + complex.sort());
	}

}
