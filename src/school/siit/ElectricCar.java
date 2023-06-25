package school.siit;

public abstract class ElectricCar implements Vehicle{
	
	private Engine engine;
	private CarFunctionality carFunctionality;
	boolean charge() {
		System.out.println("Is charged");
		return true;
	}
	public void start() {
        this.engine.start();
        carFunctionality.largerTires();
	}

    public void stop() {
    	this.engine.stop();
    	carFunctionality.print();
    	System.out.println("Car stopped");
    	System.exit(1);
    }
    public void drive(double distance) {
        if (!this.charge()) {
        	carFunctionality.print();
            System.out.println("Car stopped because it does not have enough fuel");
            System.exit(1);
        }
    }
}
