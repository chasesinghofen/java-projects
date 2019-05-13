
public class House extends Building implements MLSListable {
   private Room[] rooms;
   private int numberOfBathrooms;
   public House(Room[] rooms, int numberOfBathrooms, int numberOfWindows, int numberOfFloors) {
       super.setNumberOfFloors(numberOfFloors);
       super.setNumberOfWindows(numberOfWindows);
       this.numberOfBathrooms = numberOfBathrooms;
       this.rooms = rooms;
//for-loop returns lenght of rooms
   }
   public String genRoomSpecs() {
       String result = "";
       for (int i = 0; i < rooms.length; i++) {
           result += rooms[i].toString();
       }
       return result;
   }
   //Getters and Setters of Specs. of houses. 
   //Auto generate via Rt. Click + Source + Choose
   //returns array number of rooms/bathrooms/size of each.
   public Room[] getRooms() {
       return rooms;
   }
   public void setRooms(Room[] rooms) {
       this.rooms = rooms;
   }
   public int getNumberOfBathrooms() {
       return numberOfBathrooms;
   }
   public void setNumberOfBathrooms(int numberOfBathrooms) {
       this.numberOfBathrooms = numberOfBathrooms;
   }
   public int getAvgRoomSize() {
       int result;
       int sum = 0;
 //for-loop returns calculated room sizes.
       for (int i = 0; i < this.rooms.length; i++) {
           sum += rooms[i].getLength() * rooms[i].getWidth();
       }
       result = sum / this.rooms.length;
       return result;
   }
   //calculated getters/setters for size of houses
   public String toString() {
       String result = "Specifications of the House" + "\n\tRoom Size: " + this.getAvgRoomSize() + "\n\tBathrooms: "
               + this.getNumberOfBathrooms() + "\n\tFloors: " + this.getNumberOfFloors() + "\n\tWindows: "
               + this.getNumberOfWindows() + "\n\tRooms: " + this.rooms.length + this.genRoomSpecs() + "\n";
       return result;
   }
   public String getMLSListing() {
       return "MLSListing - " + this.toString();
   }
}
//**MLSListable.java: I don't understand the error of the MLSListing**
//**"The public type MLSListable must be defined in its own file"**
//**I tried to difine it in own file but it wont let me run the program-so i left as-is***
public interface MLSListable {
   public String getMLSListing();
}
