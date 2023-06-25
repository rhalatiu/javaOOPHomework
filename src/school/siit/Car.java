package school.siit;

public abstract class Car implements Vehicle{
	private FuelSystem fuelSystem;
    private Gearbox gearbox;
    private Engine engine;
    private FuelConsumptionCalculator consumptionCalculator;
    private CarFunctionality carFunctionality;
    
    
    public Car() {
        this.fuelSystem = new FuelSystem();
        this.gearbox = new Gearbox();
        this.engine = new Engine();
        this.consumptionCalculator = new FuelConsumptionCalculator();
        this.carFunctionality = carFunctionality;
    }

    public void start() {
        this.engine.start();
        this.gearbox.setGear(1);
        carFunctionality.largerTires();
    }

    public void stop() {
        this.engine.stop();
        carFunctionality.print();
        System.out.println("Car stopped");
        System.exit(1);
    }

    public void shiftGear(int newGear) {
        this.gearbox.setGear(newGear);
    }

    public void drive(double distance) {
        double consumption = this.consumptionCalculator.calculateFuelConsumption(distance, this.gearbox.getCurrentGear());
        this.fuelSystem.consumeFuel(consumption);

        if (!this.fuelSystem.hasEnoughFuel()) {
        	carFunctionality.print();
            System.out.println("Car stopped because it does not have enough fuel");
            System.exit(1);
        }
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