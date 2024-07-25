class AmazonRunner {
    public static void main(String args[]) {
        Amazon amazon = new Amazon();
        int length = amazon.getArrayLength();
        System.out.println("========Creation=======");
        System.out.println("The Array is created of length: " + length);
        
        System.out.println("========Insertion=======");
        amazon.insertProductName("Laptop");
        amazon.insertProductName("Smartphone");
        amazon.insertProductName("Tablet");
        amazon.insertProductName("Headphones");
        
        System.out.println("========Reading=======");
        amazon.readProductNames();
        
        System.out.println("========Updating=======");
        amazon.updateProductName("Tablet", "Smartwatch");
        amazon.readProductNames();
        
        System.out.println("========Deleting=======");
        amazon.deleteProductName("Smartwatch");
        amazon.readProductNames();
        
        System.out.println("========Searching=======");
        String search = amazon.searchProductName("Smartphone");
        System.out.println("Result: " + search);
    }
}
