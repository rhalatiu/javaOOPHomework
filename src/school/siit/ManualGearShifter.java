package school.siit;

public class ManualGearShifter implements GearShifter {
	private int currentGear;

    public void setGear(int newGear) {
        if (newGear > 0) {
            currentGear = newGear;
            System.out.println("Shifted to gear: " + currentGear);
        }
    }
	
}
