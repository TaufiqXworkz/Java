public class BiriyaniRunner {
    public static void main(String[] args) {
		String[] ingredients={"Basmati Rice", "Chicken", "Yogurt", "Spices", "Saffron", "Ghee"};
        Biriyani.displayIngredients(ingredients);
        Biriyani.displayReview(10);
        Biriyani.displayReview(7);
        Biriyani.displayReview(3);
        Biriyani.calculateTotalPrice(5, 150.0);
    }
}
