public class Room implements Comparable<Room> {
	private int length;
	private int width;
	private String floorCovering;
	private int numberOfClosets;

	public Room(int length, int width, String floorCovering, int numberOfClosets) {
		this.length = length;
		this.width = width;
		this.floorCovering = floorCovering;
		this.numberOfClosets = numberOfClosets;
	}

	// getters and setters
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getFloorCovering() {
		return floorCovering;
	}

	public void setFloorCovering(String floorCovering) {
		this.floorCovering = floorCovering;
	}

	public int getNumberOfClosets() {
		return numberOfClosets;
	}

	public void setNumberOfClosets(int numberOfClosets) {
		this.numberOfClosets = numberOfClosets;
	}

	public String toString() {
		String result = "\n\t\tLength: " + this.getLength() + " Width: " + this.getWidth() + " Closets: "
				+ this.getNumberOfClosets() + " Floor Covering: " + this.getFloorCovering();
		return result;
	}

	// if-else returns calculations about size of houses on MLSListing
	// not sure if this is where the ' -1 ' comes into play? tried to debug to
	// see.
	// a.compareTo(b) == -b.compareTo(a) must always be true.
	// compareTo must be implemented if you want to sort items.
	// here we are sorting items in an array based on each houses
	// Specifications.
	public int compareTo(Room arg0) {
		if (this.getLength() * this.getWidth() < arg0.getLength() * arg0.getWidth()) {
			return -1;// compareTo if b is bigger then the result is ' -1 '.
			// changing compareTo value doesn't effect code to much it just
			// returns diff values.
			// experimented with return -1, -2, 42
		} else if (this.getLength() * this.getWidth() > arg0.getLength() * arg0.getWidth()) {
			return 1;// if a is bigger then the result is ' +1 '
		} else {
			return 0;// if compareTo is equal return 0
		}
	}

	// compareTo apply here??
	// a.compareTo(b) == -b.compareTo(a) must always be true.
	// compareTo has to return true..
	/*
	 * The first Room compared to second Room: 0 The first Room is equal to
	 * second Room in size. Third room compared to first Room: 1 The third Room
	 * is equal to first Room in size. The third Room compared to second Room:
	 * -1
	 */
	public boolean equals(Object houseStats) {
		boolean result = false;// expieremt with true/false, return true/false.
								// didn't see chg in results??
		if (!(houseStats instanceof Room)) {
			return false;
		}
		if (this.getLength() * this.getWidth() == ((Room) houseStats).getLength() * ((Room) houseStats).getWidth()) {
			result = true;
		}
		return result;
	}
}