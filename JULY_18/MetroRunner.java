public class MetroRunner {
    public static void main(String[] args) {
        // Creating instances of Metro with different constructors
        Metro mt1 = new Metro("Namm Metro");
        Metro mt2 = new Metro("Namm Metro", 5);
        Metro mt3 = new Metro("Namm Metro", 5, 100);
        Metro mt4 = new Metro("Namm Metro", 5, 100, 200000L);
        Metro mt5 = new Metro("Namm Metro", 5, 100, 200000L, 45.5f);
        Metro mt6 = new Metro("Namm Metro", 5, 100, 200000L, 45.5f, true);
        Metro mt7 = new Metro("Namm Metro", 5, 100, 200000L, 45.5f, true, 'A');
        Metro mt8 = new Metro("Namm Metro", 5, 100, 200000L, 45.5f, true, 'A', 2.5);
        Metro mt9 = new Metro("Namm Metro", 5, 100, 200000L, 45.5f, true, 'A', 2.5, 50);
        Metro mt10 = new Metro("Namm Metro", 5, 100, 200000L, 45.5f, true, 'A', 2.5, 50, "John Doe");
    }
}
