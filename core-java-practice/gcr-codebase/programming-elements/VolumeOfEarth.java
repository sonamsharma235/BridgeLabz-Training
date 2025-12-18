public class VolumeOfEarth{
    public static void main(String[]args){
        int radiusInKilo=6378;
        double VolumeInKm=(4/3)*(pi*(Math.pow(radiusInKilo,3)));
        int radiusInMiles=67378*1.6;
        double VolumeInMiles=(4/3)*(pi*(Math.pow(VolumeInMiles,3)));
        System.out.println("The volume of earth in cubic kilometers is "+VolumeInKm+" and cubic miles is "+ VolumeInMiles);
    }
}