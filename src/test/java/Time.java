public class Time {
	public static void main(String[] args) throws InterruptedException {
		double start = System.nanoTime();
		/*for (int i = 0; i < 1000; i++) {
			double sdfsa = Math.pow(256, 84984);
		}*/
		double end = System.nanoTime();
		System.out.println((end-start));
		System.out.println(start);
		System.out.println(end);
	}
}
