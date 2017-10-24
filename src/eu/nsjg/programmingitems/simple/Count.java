package eu.nsjg.programmingitems.simple;

import java.util.List;

public class Count implements SimpleProgrammingItemStrategy {

	@Override
	public Integer getResult(List<Integer> numbers, int divider) {
		if(divider == 0) {
			throw new IllegalArgumentException("Hé köcsög, nullával nem osztunk!");
		}
		int count = 0;
		for (Integer value : numbers) {
			if(value % divider == 0) {
				count++;
			}
		}
		return count;
	}

}
