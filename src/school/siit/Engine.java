package school.siit;

public class Engine {
	private boolean isRunning;

    public void start() {
        if (!isRunning) {
            System.out.println("Engine started");
            isRunning = true;
        }
    }

    public void stop() {
        if (isRunning) {
            System.out.println("Engine stopped");
            isRunning = false;
        }
    }
}
