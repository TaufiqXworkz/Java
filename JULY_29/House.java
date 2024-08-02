/*2. Create a class with 4 properties and make it private,
assign values and display it*/

public class House {
    private String houseName;
    private long housePrice;
    private String houseAddress;
    private int numOfRooms;

    // Setter and getter methods
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseName() {
        return this.houseName;
    }

    public void setHousePrice(long housePrice) {
        this.housePrice = housePrice;
    }

    public long getHousePrice() {
        return this.housePrice;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getHouseAddress() {
        return this.houseAddress;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getNumOfRooms() {
        return this.numOfRooms;
    }

    
}
