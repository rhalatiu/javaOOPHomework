package school.siit;

public class VWPolo extends VW{

    //private
    final int fuelTankSize = 40;
    final String fuelType = "PETROL";
    final int gears = 3;
    final float consumptionPer100Km = 5.5f;

    public VWPolo(int availableFuel, String chassisNumber){
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
        this.tireSize = 15;
    }

}