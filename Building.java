public class Building {
    //class for a 2d building using only one brick type
    
    public int height; // in bricks
    public int width; // in bricks

    public Brick buildingBlock;
    
    public Building(int height, int width, Brick buildingBlock) {
        this.height = height;
        this.width = width;
        this.buildingBlock = buildingBlock;
    }

    public Building() {
        this.weight = 100;
        this.width = width;
        this.buildingBlock = Brick();
    }
    
    public String toString() {
        return "This building is " + (width*buildingBlock.getWidth())/12 + " feet wide and " + (height*buildingBlock.getHeight())/12 + "tall.";
    }

    
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int h) {
        height = h;
    }

    public void setWidth() {
        width = w;
    }

    public calculateStrength() {
        buildingBlock.getSturdiness() * height * weight;
    }

    public visualize() {
        new String returnString;

        for (i = 0; i < (height/10); i++) {

            for (i = 0; i < (width/10); i++) {
                returnString += "▢";
            }
            
            returnString += "\n";
        }
    }
}