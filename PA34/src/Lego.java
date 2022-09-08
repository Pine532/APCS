public class Lego {
	private String color;
	private int size;

	public Lego(String color, int size) {
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		return this.color + " Lego of size " + this.size;
	}
}