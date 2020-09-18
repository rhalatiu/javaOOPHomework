package school.siit;

public abstract class Car implements Vehicle{

    public void start(){
        this.consumptionPer100Km = this.consumptionStat;
        largerTires();
    }

    public void stop(){
        this.print();
        System.out.println("Car stopped");
        System.exit(1);
    }

    public void shiftGear(int newGear){
        if (newGear > this.gears || newGear <= 0)
            return;

        currentGear = newGear;

        if (consumptionPer100Km <= 0)
            this.stop();
    }

    public void largerTires(){
        if (this.tireSize > 17)
            this.consumptionPer100Km += 0.15 * this.consumptionPer100Km;
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

        if (this.availableFuel - (float)consumption <= 0){
            this.print();
            System.out.println("Car stopped because it does not have enough fuel");
            System.exit(1);
        }
        this.availableFuel = this.availableFuel - (float)consumption;
    }

    public void print(){
        float availableFuel = this.getAvailableFuel();

        float fuelConsumedPer100Km = this.getAverageFuelConsumption();

        System.out.println(availableFuel);
        System.out.println(fuelConsumedPer100Km);
    }

    //private
    int fuelTankSize = 0;
    String fuelType = "";
    int gears = 0;
    float consumptionPer100Km = 0;
    int currentGear = 0;
    float consumptionStat = 0;

    //public
    protected float availableFuel = 0;
    protected int tireSize = 0;
    protected String chassisNumber = "";
}