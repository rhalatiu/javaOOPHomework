package school.siit;

public class VWPolo extends VW{

    public VWPolo(int availableFuel, String chassisNumber){
        fuelTankSize = 40;
        String fuelType = "PETROL";
        gears = 3;
        consumptionPer100Km = 5.5f;
        consumptionStat = 5.5f;

        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
        this.tireSize = 15;
    }

    @Override
    public void shiftGear(int newGear) {
        if (newGear > this.gears || newGear <= 0)
            return;

        if (this.gears == this.currentGear)
            consumptionPer100Km = consumptionPer100Km * (newGear - currentGear);
        else
            consumptionPer100Km -= 0.1f * consumptionPer100Km * (newGear - currentGear);

        currentGear = newGear;

        if (consumptionPer100Km <= 0)
            this.stop();
    }

}