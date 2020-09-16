package school.siit;

public class MercedesSKlasse extends Mercedes{
    //private
    final int fuelTankSize = 65;
    final String fuelType = "DIESEL";
    final int gears = 6;
    final float consumptionPer100Km = 8.9f;

    public MercedesSKlasse(int availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
        this.tireSize = 20;
    }
}