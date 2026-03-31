class TemperatureAnalyzer {
    static void analyze(float[][] temp) {
        float hottestAvg = temp[0][0], coldestAvg = temp[0][0];
        int hottestDay = 0, coldestDay = 0;

        for (int i = 0; i < 7; i++) {
            float sum = 0;
            for (int j = 0; j < 24; j++) {
                sum += temp[i][j];
            }
            float avg = sum / 24;
            System.out.println("Average temperature of Day " + (i + 1) + ": " + avg);

            if (avg > hottestAvg) {
                hottestAvg = avg;
                hottestDay = i;
            }
            if (avg < coldestAvg) {
                coldestAvg = avg;
                coldestDay = i;
            }
        }
        System.out.println("Hottest Day: " + (hottestDay + 1));
        System.out.println("Coldest Day:" + (coldestDay + 1));
    }
    public static void main(String[] args) {
        float[][] temperatures = new float[7][24];
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 24; j++){
                temperatures[i][j] = 20 + i;
            }
        }
        analyze(temperatures);
    }
}
