package school.siit;

public class VWPassat extends VW{

    public VWPassat(int availableFuel, String chassisNumber){
        fuelTankSize = 45;
        String fuelType = "DIESEL";
        gears = 4;
        consumptionPer100Km = 6.4f;

        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
        this.tireSize = 17;
    }
}