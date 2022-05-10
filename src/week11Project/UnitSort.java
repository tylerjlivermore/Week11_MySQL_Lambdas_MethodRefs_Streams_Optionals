package week11Project;

import java.util.List;

public class UnitSort {

	public static void main(String[] args) {
		new UnitSort().run();
	}

	private void run() {
		List<Unit> lambdaUnits = sortByLambda();
		System.out.println(lambdaUnits);
		
		List<Unit> methodUnits = sortByMethod();
		System.out.println(methodUnits);
	}

	private List<Unit> sortByLambda() {
		List<Unit> units = Unit.getUnits();
		units.sort((u1, u2) -> Unit.compare(u1, u2));
		return units;
	}
	
	private List<Unit> sortByMethod() {
		List<Unit> units = Unit.getUnits();
		units.sort(Unit::compare);
		return units;
	}
}