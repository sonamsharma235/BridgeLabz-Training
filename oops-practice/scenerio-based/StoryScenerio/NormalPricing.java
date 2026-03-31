package StoryScenerio;

public class NormalPricing implements FareCalculator {
	public double fareCalculate(double distance) {
		return distance*20;
	}
}
