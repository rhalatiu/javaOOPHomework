package school.siit;

public class AutomaticGearShifter implements GearShifter{
	private int currentGear;

    public void setGear(int newGear) {
        if (newGear >= 1 && newGear <= 5) {
            currentGear = newGear;
            System.out.println("Shifted to gear: " + currentGear);
        }
	}
}
