package StoryScenerio;

public class PeakPricing implements FareCalculator{
	public double fareCalculate(double distance) {
		return distance*40;
	}

}
