package school.siit;

public class FuelSystem { 
	private float availableFuel;

    public FuelSystem() {
    }

    public void consumeFuel(double amount) {
        this.availableFuel -= amount;
    }

    public boolean hasEnoughFuel() {
        return this.availableFuel > 0;
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

}
