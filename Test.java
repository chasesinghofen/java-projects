
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		ArrayList<Building> buildingsArray = new ArrayList<Building>();

		Room additionalRoom = new Room(2, 2, "Laminate Wood Flooring", 2);
		Room firstRoom = new Room(2, 3, "Blue Carpet", 1);
		Room secondRoom = new Room(3, 2, "Red Carpet", 1);
		Room thirdRoom = new Room(3, 3, "Green Carpet", 2);
		Room diningRoom = new Room(4, 5, "Hardwood/Bamboo", 3);
		Room livingRoom = new Room(5, 5, "Tile", 4);
//added additional house,garage and roomSet with no stats to experiment what code is doing.
		Room[] roomSet1 = { additionalRoom, firstRoom, secondRoom, thirdRoom };
		Room[] roomSet2 = { diningRoom, livingRoom };
		Room[] roomSet3 = { firstRoom, thirdRoom, secondRoom };
		Room[] roomSet4 = { livingRoom, secondRoom, additionalRoom };
		Room[] roomSet5 = { additionalRoom, diningRoom, livingRoom, thirdRoom };


		House house1 = new House(roomSet1, 2, 2, 3);
		House house2 = new House(roomSet2, 2, 4, 1);
		House house3 = new House(roomSet3, 3, 2, 2);
		House house4 = new House(roomSet4, 4, 4, 3);
		House house5 = new House(roomSet5, 0, 0, 0);

		Garage garage1 = new Garage(700, 500, 500, 102, "Block/Brick-Traditional");
		Garage garage2 = new Garage(1, 1, 1, 3, "Open (No Door attactched)");
		Garage garage3 = new Garage(2, 6, 7, 4, "Breezeway-Open Ended Garage");
		Garage garage4 = new Garage(1, 1, 1, 1, "3 Car Garage");
		Garage garage5 = new Garage(0, 0, 0, 0, "3 Car Garage");

		buildingsArray.add(house1);
		buildingsArray.add(house2);
		buildingsArray.add(house3);
		buildingsArray.add(house4);
		buildingsArray.add(house5);
		buildingsArray.add(garage1);
		buildingsArray.add(garage2);
		buildingsArray.add(garage3);
		buildingsArray.add(garage4);
		buildingsArray.add(garage5);

		for (Building aBuilding : buildingsArray) {
//a.compareTo(b)  ==  -b.compareTo(a)  must always be true.***
//not sure where this comes to play? 		
//a-b if a is bigger, the result is positive (+1) else,
//if b is bigger the result is negative, if they're equal its 0.
			/*The first Room compared to second Room: 0
			The first Room is equal to second Room in size.
			Third room compared to first Room: 1
			The third Room is equal to first Room in size.
			The third Room compared to second Room: -1
			*/
			if (aBuilding instanceof House) {
				housePassMethod((House) aBuilding);
			} else {
				System.out.println(aBuilding.toString());
			}
		}

		System.out.println("The first Room compared to second Room: " + firstRoom.compareTo(secondRoom));
		if (firstRoom.equals(secondRoom)) {
			System.out.println("The first Room is equal to second Room in size.");
		} else {
			System.out.println("The first Room is not equal to second Room in size.");
		}

		System.out.println("Third room compared to first Room: " + thirdRoom.compareTo(firstRoom));
		if (thirdRoom.equals(firstRoom)) {
			System.out.println("The third Room is equal to first Room in size.");
		} else {
			System.out.println("The third Room is not equal to first Room in size.");
		}
//2 additional if-else statements to compare results. Not sure if successful or not??
		System.out.println("The third Room compared to second Room: " + secondRoom.compareTo(thirdRoom));
		if (thirdRoom.equals(secondRoom)) {
			System.out.println("The second Room is equal to the third Room in size.");
		} else {
			System.out.println("The second Room is not equal to third Room in size.");
		}
		
		System.out.println("The first Room compared to second Room: " + firstRoom.compareTo(additionalRoom));
		if (firstRoom.equals(additionalRoom)) {
			System.out.println("The first Room is equal to the additional Room in size.");
		} else {
			System.out.println("The first Room is not equal to the additional Room in size.");
		}
	}

	public static void housePassMethod(MLSListable house) {

		System.out.println(house.getMLSListing());

	}
}
