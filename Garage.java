public class Garage extends Building {
   private int numberOfCars;
   private String garageConstruction;
   private int length;
   private int width;
   public Garage(int numberOfWindows, int length, int width, int numberOfCars, String floorCovering) {
       super.setNumberOfFloors(1);
       super.setNumberOfWindows(numberOfWindows);
       this.length = length;
       this.width = width;
       this.numberOfCars = numberOfCars;
       this.garageConstruction = floorCovering;
   }
   //getters and setters
   public int getNumberOfCars() {
       return numberOfCars;
   }
   public void setNumberOfCars(int numberOfCars) {
       this.numberOfCars = numberOfCars;
   }
   public String getFloorCovering() {
       return garageConstruction;
   }
   public void setFloorCovering(String garageConstruction) {
       this.garageConstruction = garageConstruction;
   }
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
   public String toString() {
       String result = "Specifications of the Garage" + "\n\tLength: " + this.getLength() + "\n\tWidth: " + this.getWidth()
               + "\n\tFloor Covering: " + this.getFloorCovering() + "\n\tNumber of Cars: " + this.getNumberOfCars()
               + "\n";
       return result;
   }
}