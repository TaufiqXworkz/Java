public class MouseRunner{

	 public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.displayModels();
        mouse.getMouseQuantity();
        mouse.displayMousePrice("TechBrand", 1500);
        mouse.displayMouseDetails(true);
    }

}