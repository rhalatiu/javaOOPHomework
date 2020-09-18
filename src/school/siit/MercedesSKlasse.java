package school.siit;

public class MercedesSKlasse extends Mercedes{
    public MercedesSKlasse(int availableFuel, String chassisNumber) {

        fuelTankSize = 65;
        String fuelType = "DIESEL";
        gears = 6;
        consumptionPer100Km = 9.7f;
        consumptionStat = 9.7f;

        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
        this.tireSize = 20;
    }

    @Override
    public void shiftGear(int newGear) {
        super.shiftGear(newGear);
    }
}