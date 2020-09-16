package school.siit;

public class MercedesEKlasse extends Mercedes{
    //private
    final int fuelTankSize = 55;
    final String fuelType = "PETROL";
    final int gears = 5;
    final float consumptionPer100Km = 6.4f;

    public MercedesEKlasse(int availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
        this.tireSize = 18;
    }
}