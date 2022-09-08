/*
Name:Owen Zhang
Block:D
Program: PA30
Date:1/14/22
*/

/**
 * This class file needs the findHorseSpace(String name) and consolidate()
 * methods completed. Needs to be saved as HorseBarn.java
 */

public class HorseBarn {
	/**
	 * The spaces in the barn. Each array element holds a reference to the horse
	 * that is currently occupying the space. A null value indicates an empty space.
	 */
	private Horse[] spaces;

	/**
	 * Constructor that takes the number of stalls DO NOT TOUCH THIS CONSTRUCTOR
	 * 
	 * @param numStalls - the number of stalls in the barn
	 */
	public HorseBarn(int numStalls) {
		spaces = new Horse[numStalls];
	}

	/**
	 * @return The horse's name and the weight. DO NOT TOUCH THIS METHOD
	 */
	public String toString() {
		String result = "";
		Horse h = null;
		for (int i = 0; i < spaces.length; i++) {
			h = spaces[i];
			result = result + "space " + i + " has ";
			if (h == null)
				result = result + " null \n";
			else
				result = result + h.toString() + "\n";
		}
		return result;
	}
	/** 
	* Adds a horse to the barn.
	* @param horse the horse to be added
	* @param spot the spot the horse should be added to
	*/
	public void addHorse(Horse horse, int spot) {
		spaces[spot] = horse;
	}

	/**
	 * Returns the index of the space that contains the horse with the specified
	 * name. Precondition: No two horses in the barn have the same name.
	 * 
	 * @param name the name of the horse to find
	 * @return the index of the space containing the horse with the specified name;
	 *         -1 if no horse with the specified name is in the barn.
	 */
	public int findHorseSpace(String name) {
		//TODO: Fill code in here...
		for(int i = 0; i<spaces.length; i++) {
			if(spaces[i] == null) {
				continue;
			}
			else if(spaces[i].getName().equals(name)) {
				return i;
			}
		} 
			return -1;
	}

	/**
	 * Consolidates the barn by moving horses so that the horses are in adjacent
	 * spaces, starting at index 0, with no empty space between any two horses.
	 * Postcondition: The order of the horses is the same as before the
	 * consolidation.
	 */
	public void consolidate() {
		for(int i = 0; i<spaces.length; i++) {
			if(spaces[i] == null)		{
				for(int k = i; k < spaces.length; k++) {
					if(spaces[k] == null) {
						continue;
					}else {
						spaces[i] = spaces[k];
						spaces[k] = null;
						break;
					}
					
				}
			}
			}
    }		
	}
