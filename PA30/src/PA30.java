/**
 * This class just has the main method. It doesn't need to be changed unless the
 * student wants to try other test. Needs to be saved as PA30.java
 */

public class PA30 {
	/**
	 * This is the main method of the program. The student can change it to test
	 * different inputs for their program. The main method will not be checked for
	 * accuracy. The reason this method can alter the barn spaces is because it is
	 * in the same class file as HorseBarn.
	 * 
	 * @param args is not used
	 */
	public static void main(String[] args) {
		HorseBarn barn = new HorseBarn(7);
		barn.addHorse(new Horse("Trigger", 1340), 0);
		barn.addHorse(new Horse("Silver", 1210), 2);
		barn.addHorse(new Horse("Lady", 1575), 3);
		barn.addHorse(new Horse("Patches", 1350), 5);
		barn.addHorse(new Horse("Duke", 1410), 6);

		// print out what is in the barn
		System.out.println("Barn has...");
		System.out.println(barn);

		// Below tests the findHorseSpace method.
		System.out.println("Index of Trigger should be 0 and is " + barn.findHorseSpace("Trigger"));
		System.out.println("Index of Silver should be 2 and is " + barn.findHorseSpace("Silver"));
		System.out.println("Index of Coco should be -1 and is " + barn.findHorseSpace("Coco"));

		// Below tests the findHorseSpace method. Comment out to test.
        /*
		System.out.println("-----------------");
		System.out.println("before consolidate");
		System.out.println(barn);
		barn.consolidate();
		System.out.println("after consolidate");
		System.out.println(barn);
        */
	}
}