public class SheepRunner{

	 public static void main(String[] args) {
        Sheep sheepDetails = new Sheep();

        String[] names = {"Sultaan", "Dori", "Maccha"};
        int[] ages = {2, 3, 4};
        double[] weights = {45.5, 50.0, 55.5};
        String[] colors = {"Hanichukki", "Black", "Red"};

        sheepDetails.setSheepNames(names);
        sheepDetails.setSheepAges(ages);
        sheepDetails.setSheepWeights(weights);
        sheepDetails.setSheepColors(colors);

        System.out.println("Sheep Names: ");
        for (String name : sheepDetails.getSheepNames()) {
            System.out.println(name);
        }

        System.out.println("\nSheep Ages: ");
        for (int age : sheepDetails.getSheepAges()) {
            System.out.println(age);
        }

        System.out.println("\nSheep Weights: ");
        for (double weight : sheepDetails.getSheepWeights()) {
            System.out.println(weight);
        }

        System.out.println("\nSheep Colors: ");
        for (String color : sheepDetails.getSheepColors()) {
            System.out.println(color);
        }
    }

}