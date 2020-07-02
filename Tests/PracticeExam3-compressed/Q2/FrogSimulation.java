public class FrogSimulation {

	private int goalDistance;
	private int maxHops;
	
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}
	
	public int hopDistance() {
		double hopRange = (double)goalDistance/(double)maxHops*3;
		return (int)(Math.random()*hopRange-(hopRange/6));
	}
	
	public HopsRecord simulate () {
		HopsRecord record = new HopsRecord();
		while(true) {
			record.addHop( hopDistance() );
			if (record.getSum() > goalDistance) {
				record.setSuccess(true);
				return record;
			}
			if (record.getSum() < 0) {
				record.setSuccess(false);
				return record;
			}
			if (record.getCount() > maxHops) {
				record.setSuccess(false);
				return record;
			}
		}
	}
	
	public static void main (String[] args) {
		FrogSimulation fs = new FrogSimulation(24, 6);
		HopsRecord hr = fs.simulate();
		System.out.println( hr );
	}
	
}