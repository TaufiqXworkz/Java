public class Recharge {
    public String mobileNumber;
    public double amount;
    public String serviceProvider;
    public boolean isSuccess;
    public String transactionId;
    public String date;
    public String time;
    public String rechargeType;
    public int validity;
    public String planName;
    
    // Constructors with different parameter lists
    public Recharge(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        System.out.println(mobileNumber);
    }
    
    public Recharge(String mobileNumber, double amount) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        System.out.println(mobileNumber + " " + amount);
    }
    
    public Recharge(String mobileNumber, double amount, String serviceProvider) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.serviceProvider = serviceProvider;
        System.out.println(mobileNumber + " " + amount + " " + serviceProvider);
    }
    
    public Recharge(String mobileNumber, double amount, String serviceProvider, boolean isSuccess) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.serviceProvider = serviceProvider;
        this.isSuccess = isSuccess;
        System.out.println(mobileNumber + " " + amount + " " + serviceProvider + " " + isSuccess);
    }
    
    public Recharge(String mobileNumber, double amount, String serviceProvider, boolean isSuccess, String transactionId) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.serviceProvider = serviceProvider;
        this.isSuccess = isSuccess;
        this.transactionId = transactionId;
        System.out.println(mobileNumber + " " + amount + " " + serviceProvider + " " + isSuccess + " " + transactionId);
    }
    
    public Recharge(String mobileNumber, double amount, String serviceProvider, boolean isSuccess, String transactionId, String date) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.serviceProvider = serviceProvider;
        this.isSuccess = isSuccess;
        this.transactionId = transactionId;
        this.date = date;
        System.out.println(mobileNumber + " " + amount + " " + serviceProvider + " " + isSuccess + " " + transactionId + " " + date);
    }
    
    public Recharge(String mobileNumber, double amount, String serviceProvider, boolean isSuccess, String transactionId, String date, String time) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.serviceProvider = serviceProvider;
        this.isSuccess = isSuccess;
        this.transactionId = transactionId;
        this.date = date;
        this.time = time;
        System.out.println(mobileNumber + " " + amount + " " + serviceProvider + " " + isSuccess + " " + transactionId + " " + date + " " + time);
    }
    
    public Recharge(String mobileNumber, double amount, String serviceProvider, boolean isSuccess, String transactionId, String date, String time, String rechargeType) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.serviceProvider = serviceProvider;
        this.isSuccess = isSuccess;
        this.transactionId = transactionId;
        this.date = date;
        this.time = time;
        this.rechargeType = rechargeType;
        System.out.println(mobileNumber + " " + amount + " " + serviceProvider + " " + isSuccess + " " + transactionId + " " + date + " " + time + " " + rechargeType);
    }
    
    public Recharge(String mobileNumber, double amount, String serviceProvider, boolean isSuccess, String transactionId, String date, String time, String rechargeType, int validity) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.serviceProvider = serviceProvider;
        this.isSuccess = isSuccess;
        this.transactionId = transactionId;
        this.date = date;
        this.time = time;
        this.rechargeType = rechargeType;
        this.validity = validity;
        System.out.println(mobileNumber + " " + amount + " " + serviceProvider + " " + isSuccess + " " + transactionId + " " + date + " " + time + " " + rechargeType + " " + validity);
    }
    
    public Recharge(String mobileNumber, double amount, String serviceProvider, boolean isSuccess, String transactionId, String date, String time, String rechargeType, int validity, String planName) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.serviceProvider = serviceProvider;
        this.isSuccess = isSuccess;
        this.transactionId = transactionId;
        this.date = date;
        this.time = time;
        this.rechargeType = rechargeType;
        this.validity = validity;
        this.planName = planName;
        System.out.println(mobileNumber + " " + amount + " " + serviceProvider + " " + isSuccess + " " + transactionId + " " + date + " " + time + " " + rechargeType + " " + validity + " " + planName);
    }
}
