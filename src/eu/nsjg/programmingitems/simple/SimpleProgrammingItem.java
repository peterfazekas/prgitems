package eu.nsjg.programmingitems.simple;

public enum SimpleProgrammingItem {

	CALCULATE("Sorozatsz�m�t�s: ", new Calculate()),
	DECIDE("Eld�nt�s: ", new Decide()),
	SELECT("Kiv�laszt�s: ", new Select()),
	FIND("Keres�s: ", new Find()),
	COUNT("Megsz�mol�s: ", new Count()),
	MAX_VALUE("Maximum �rt�k: ", new MaxValue());
	
	private final String description;
	private final SimpleProgrammingItemStrategy item;
	
	private SimpleProgrammingItem(String description, SimpleProgrammingItemStrategy item) {
		this.description = description;
		this.item = item;
	}

	public String getDescription() {
		return description;
	}

	public SimpleProgrammingItemStrategy getItem() {
		return item;
	}
	
	
}
