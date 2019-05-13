public abstract class Building {
   private int numberOfFloors;
   private int numberOfWindows;
   public int getNumberOfFloors() {
       return numberOfFloors;
   }
   //Getter and Setters for Specs of houses.
   public void setNumberOfFloors(int numberOfFloors) {
       this.numberOfFloors = numberOfFloors;
   }
   public int getNumberOfWindows() {
       return numberOfWindows;
   }
   public void setNumberOfWindows(int numberOfWindows) {
       this.numberOfWindows = numberOfWindows;
   }
   public String toString() {
       String result = "Specifications of the Building";
       return result;
   }
}