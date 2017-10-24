package eu.nsjg.programmingitems.simple;

import java.util.List;

public class Select implements SimpleProgrammingItemStrategy {

	@Override
	public Integer getResult(List<Integer> numbers, int divider) {
		if(divider == 0) {
			throw new IllegalArgumentException("H� k�cs�g, null�val nem osztunk!");
		}
		int i = 0;
		while (numbers.get(i) % divider != 0)
			i++;
		return i;
	}

}
