package school.siit;

public abstract class Car implements Vehicle{

    public void shiftGear(int newGear){
        if (newGear > this.gears || newGear <= 0)
            return;
        consumptionPer100Km -= 0.1f*consumptionPer100Km * (newGear - currentGear);
        currentGear = newGear;
    }
    public float getAvailableFuel(){
        return availableFuel;
    }
    public float getAverageFuelConsumption(){
        return consumptionPer100Km;
    }

    @Override
    public void drive(double distance) {
        double consumption = distance * this.consumptionPer100Km;
        this.availableFuel = this.availableFuel - (float)consumption;
    }

    //private
    int fuelTankSize = 0;
    String fuelType = "";
    int gears = 0;
    float consumptionPer100Km = 0;
    int currentGear = 0;


    //public
    protected float availableFuel = 0;
    protected int tireSize = 0;
    protected String chassisNumber = "";
}