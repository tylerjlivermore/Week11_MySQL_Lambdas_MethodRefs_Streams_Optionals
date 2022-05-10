package week11Project;

import java.util.ArrayList;
import java.util.List;

public class Unit {
		private String name;
		private String weapon;
		private String banner;
		private Boolean autoWin;
		
		//static data entry
		private static List<Unit> unitList = List.of(
			new Unit("Yeoman", "Bow", "Dragon", Boolean.FALSE),
			new Unit("Berserker", "Ax", "Bear", Boolean.FALSE),
			new Unit("Acrobat", "Rod", "Giraffe", Boolean.FALSE),
			new Unit("Grand Knight", "Imperial Edict", "Scorpion", Boolean.TRUE),
			new Unit("Berserker's Brother", "Ax", "Bear", Boolean.FALSE)
		);
	
		//Class Constructor
		public Unit (String name, String weapon, String banner, Boolean autoWin) {
			this.name = name;
			this.weapon = weapon;
			this.banner = banner;
			this.autoWin = autoWin;
		}
		
		//Getters
		public String getUnit() {
			return name;
		}
		public String getWeapon() {
			return weapon;
		}
		public String getBanner() {
			return banner;
		}
		public Boolean isAutoWin() {
			return autoWin;
		}
		public static List<Unit> getUnits() {
			return new ArrayList<>(unitList); //Arraylist allows return list to be modifiable
		}	
		
		@Override
		public String toString() {
			return banner + "'s " + name + " [" + weapon + "]";
		}
		
		public static int compare(Unit a, Unit b) {
			//AutoWin > Rod > Ax > Bow
				
			//A < B if:
				//1. A is not AutoWin and B is AutoWin
				//2. A is not AutoWin & Rod and B is Rod
				//3. A is Bow and B is not Bow (Ax or Rod)
			if  (  (!a.isAutoWin() && b.isAutoWin())
				|| ((!a.isAutoWin() && !a.getWeapon().equals("Rod")) && b.getWeapon().equals("Rod"))
				|| (a.getWeapon().equals("Bow") && !b.getWeapon().equals("Bow"))
				)
				return 1;
			
			//A = B
			if (a.getWeapon().equals(b.getWeapon()))
				return 0;
			
			//B > A (else)
			return -1;
		}
	}