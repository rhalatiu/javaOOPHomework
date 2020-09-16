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
    @Override
    public void shiftGear(int newGear){
        if (newGear > this.gears || newGear <= 0)
            return;
        consumptionPer100Km -= 0.2f * consumptionPer100Km * (newGear - currentGear);
        currentGear = newGear;
    }
}