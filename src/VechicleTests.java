public class VechicleTests
{
  public static void main(String[] args)
  {
    Car myCar = new Car("MK4567", 10.0, 3, true);
    System.out.println(myCar.calculateTollPrice());

    Car myCar2 = new Car("FJ8731", 10.0, 6, true);
    System.out.println(myCar2.calculateTollPrice());

    // the way toll price is calculated for a Vehicle
    // shouldn't have changed
    Vehicle myVehicle = new Vehicle("KX1543", 10.0, 6);
    System.out.println(myVehicle.calculateTollPrice());


  }
}
