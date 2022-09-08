/**
 * There is not need to edit this class file. It works as intended without
 * modification. Needs to be saved as Horse.java
 */

public class Horse {

	private String name;
	private int weight;

	/** 
	* Creates a horse with a name and weight
	* @param name is the horse's name
	* @param weight is the horse's weight
	*/
	public Horse(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	/** @return the horse's name */
	public String getName() {
		return name;
	}

	/** @return the horse's weight */
	public int getWeight() {
		return weight;
	}
	/** @return the name and the weight of the horse */
	public String toString() {
		return "name: " + this.name + " weight: " + this.weight;
	}
}