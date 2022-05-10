package week11Project;

import java.util.stream.Collectors;

public class UnitStream {

	public static void main(String[] args) {
		new UnitStream().run();
	}

	private void run() {
		String unitListAsString = Unit.getUnits().stream()
		.map(Object::toString)
		.sorted()
		.collect(Collectors.joining(", "));

		System.out.println(unitListAsString);
		//System.out.println(newUnitList.length()); 
		//no leading "[" or trailing "]", and length confirms output was made as a String
		
	}		
}