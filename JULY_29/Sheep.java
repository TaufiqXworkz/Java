/*3.Create class with 4 properties(properties should taken has array type)
and make it private and assign values and display it.*/

public class Sheep {
    private String[] sheepNames;
    private int[] sheepAges;
    private double[] sheepWeights;
    private String[] sheepColors;

    public void setSheepNames(String[] sheepNames) {
        this.sheepNames = sheepNames;
    }

    public String[] getSheepNames() {
        return this.sheepNames;
    }

    public void setSheepAges(int[] sheepAges) {
        this.sheepAges = sheepAges;
    }

    public int[] getSheepAges() {
        return this.sheepAges;
    }

    public void setSheepWeights(double[] sheepWeights) {
        this.sheepWeights = sheepWeights;
    }

    public double[] getSheepWeights() {
        return this.sheepWeights;
    }

    public void setSheepColors(String[] sheepColors) {
        this.sheepColors = sheepColors;
    }

    public String[] getSheepColors() {
        return this.sheepColors;
    }

   
}
