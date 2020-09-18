package school.siit;

public class MercedesEKlasse extends Mercedes{
    public MercedesEKlasse(int availableFuel, String chassisNumber) {

        fuelTankSize = 55;
        String fuelType = "PETROL";
        gears = 5;
        consumptionPer100Km = 7.9f;
        consumptionStat = 7.9f;

        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
        this.tireSize = 16;
    }

    @Override
    public void shiftGear(int newGear) {
        super.shiftGear(newGear);
    }
}