public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }
  public boolean chargeAndDropOffRider(double FarePerRider)
  {
    int people= getPassengers()-1;
    double totalFare=FarePerRider* people;
    fareCollected+=totalFare;
    boolean successfulDrop=dropOffPassengers((people));
    return successfulDrop;
  }

}