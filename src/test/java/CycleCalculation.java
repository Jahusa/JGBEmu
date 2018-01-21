public class CycleCalculation {

	public static final int CLOCKS_PER_SECOND = 4*1024*1024;
	public static final int CYCLES = 4;

	public static void main(String[] args) {
		double startTime = System.nanoTime();

		double startCycleTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			executeSomething();
			double endCycleTime = System.nanoTime();
			startCycleTime = timingSync(CYCLES, startCycleTime, endCycleTime);
		}
		
		double endTime = System.nanoTime();
		System.out.println(((endTime - startTime)/1000000000));
	}
	
	public static void executeSomething() {
		for (int i = 0; i < 1; i++) {
			Math.pow(25, 984);
		}
	}
	
	public static double timingSync(int cycles, double startTime, double endTime) {
		double timeElapsed = (endTime - startTime);
		double cycleTime = cycles * (1/CLOCKS_PER_SECOND)*100000000;
		try {
			Thread.sleep(0, ((int) (cycleTime-timeElapsed)));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return startTime+cycleTime;
	}
}
