package school.siit;

public class CarFunctionalityImpl implements CarFunctionality{
	private int tireSize;
    private float consumptionPer100Km;
    private float availableFuel;

	@Override
    public void largerTires() {
        if (tireSize > 17) {
            consumptionPer100Km += 0.15 * consumptionPer100Km;
        }
    }

    @Override
    public void print() {
        System.out.println("Available fuel: " + availableFuel);
        System.out.println("Average fuel consumption: " + consumptionPer100Km);
    }	

}
