public class HouseRunner{

    public static void main(String[] args) {
        House houseDetails = new House();

        houseDetails.setHouseName("Saad Manzil");
        System.out.println("The name of the house is " + houseDetails.getHouseName());

        houseDetails.setHousePrice(7000000L);
        System.out.println("The price of the house is " + houseDetails.getHousePrice());

        houseDetails.setHouseAddress("Manjunath Nagar, Betgeri, Gadag 582102");
        System.out.println("The address of the house is " + houseDetails.getHouseAddress());

        houseDetails.setNumOfRooms(10);
        System.out.println("The number of rooms in the house is " + houseDetails.getNumOfRooms());
    }

}