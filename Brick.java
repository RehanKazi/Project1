public class Brick {
   
    // Dimensions                                                        
    private double width;    //inches
    private double height; //inches
    private double length;//inches

   //Properties
    private String material;
    private double weight; //weight in lbs
    private String color;

    private double sturdiness; //weight in lbs
    private int lifeTime; //years

    public Brick () {
        length = 8.46;
        width = 4.4;
        height = 2.5;
        weight = 4.3;
        material = "clay";
        color = "red";
        sturdiness = 1700;
        lifeTime = 650;
    }
    
    public String toString() {
        return "L: " +  length + ", W; " + width + "  H: " + height + "/n" + "Color: " + color + "/n" + "Weight: " + weight;
    }
    
    public double getWidth () {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public double getSturdiness() {
        return sturdiness;
    }

    public int returnLifeTime() {
        return lifeTime;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setLength(double l) {
        length = l;
    }

    public void setMaterial(String m) {
        material = m;
    }

    public void setWeight(double w) {
        weight = w;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setSturdiness(double s) {
        sturdiness = s;
    }

    public void setLifeTime(int y) {
        lifeTime = y;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    public double getDensity() {
        return weight / this.calculateVolume();
    }

    public void damage() {
        sturdiness *= 0.8;
        lifeTime *= 0.8;
    }
}