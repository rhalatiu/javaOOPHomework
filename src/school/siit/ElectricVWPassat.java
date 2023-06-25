package school.siit;

public class ElectricVWPassat extends ElectricCar{
    public boolean isRunning;
	@Override
	public void start() {
		System.out.println("Electric engine started");
        isRunning = true;
		
	}

	@Override
	public void stop() {
		System.out.println("Electric engine stopped");
        isRunning = false;
		
	}
	public void drive(double distance) {
		System.out.println("Is driving");
        isRunning = true;
    }


}
