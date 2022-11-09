public class Brick {
    // Dimensions
                           //  _____            _               
    public double width;   // |_   _|          | |              
    public double height;  //   | |  _ __   ___| |__   ___  ___ 
    public double length;  //   | | | '_ \ / __| '_ \ / _ \/ __|
                           //  _| |_| | | | (__| | | |  __/\__ \
                           // |_____|_| |_|\___|_| |_|\___||___/


    private String material;
    private double weight; //weight in lbs
    private String color;

    private double sturdiness; //weight in lbs
    private int lifeTime; //years

    public Brick () {
        length = 8.46;
        width = 4.4;
        height = 2.5;
    }
    
    public Brick (int length, int width, int height, int weight, int lifeTime) {

    }
}