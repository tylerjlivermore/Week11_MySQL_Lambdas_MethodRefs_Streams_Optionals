package week11Project;

import java.util.NoSuchElementException;
import java.util.Optional;

public class UnitOptional {

	public static void main(String[] args) {
		new UnitOptional().run();
	}

	private void run() {
		Unit unit = unitMethod(Optional.of(new Unit("Warlock", "Artifact", "Spider", Boolean.FALSE)));
		System.out.println(unit);
		
		try {
			unitMethod(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private Unit unitMethod(Optional<Unit> optionalUnit) {
		return optionalUnit.orElseThrow(() -> new NoSuchElementException("He is not on this battlefield! Thank goodness."));
	}
}