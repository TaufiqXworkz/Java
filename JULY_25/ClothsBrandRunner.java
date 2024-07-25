class ClothsBrandRunner {
    public static void main(String args[]) {
        ClothsBrand clothsBrand = new ClothsBrand();
        int length = clothsBrand.getArrayLength();
        System.out.println("========Creation=======");
        System.out.println("The Array is created of length: " + length);
        
        System.out.println("========Insertion=======");
        clothsBrand.insertProductName("Shirt");
        clothsBrand.insertProductName("Jeans");
        clothsBrand.insertProductName("Jacket");
        clothsBrand.insertProductName("T-Shirt");
        
        System.out.println("========Reading=======");
        clothsBrand.readProductNames();
        
        System.out.println("========Updating=======");
        clothsBrand.updateProductName("Jacket", "Sweater");
        clothsBrand.readProductNames();
        
        System.out.println("========Deleting=======");
        clothsBrand.deleteProductName("Sweater");
        clothsBrand.readProductNames();
        
        System.out.println("========Searching=======");
        String search = clothsBrand.searchProductName("Jeans");
        System.out.println("Result: " + search);
    }
}
