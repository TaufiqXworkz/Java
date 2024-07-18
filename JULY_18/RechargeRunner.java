public class RechargeRunner {
    public static void main(String[] args) {
        // Creating instances of Recharge with different constructors
        Recharge rc1 = new Recharge("1234567890");
        Recharge rc2 = new Recharge("1234567890", 100.0);
        Recharge rc3 = new Recharge("1234567890", 100.0, "Vodafone");
        Recharge rc4 = new Recharge("1234567890", 100.0, "Vodafone", true);
        Recharge rc5 = new Recharge("1234567890", 100.0, "Vodafone", true, "TXN123456");
        Recharge rc6 = new Recharge("1234567890", 100.0, "Vodafone", true, "TXN123456", "2024-07-18");
        Recharge rc7 = new Recharge("1234567890", 100.0, "Vodafone", true, "TXN123456", "2024-07-18", "12:30 PM");
        Recharge rc8 = new Recharge("1234567890", 100.0, "Vodafone", true, "TXN123456", "2024-07-18", "12:30 PM", "Prepaid");
        Recharge rc9 = new Recharge("1234567890", 100.0, "Vodafone", true, "TXN123456", "2024-07-18", "12:30 PM", "Prepaid", 28);
        Recharge rc10 = new Recharge("1234567890", 100.0, "Vodafone", true, "TXN123456", "2024-07-18", "12:30 PM", "Prepaid", 28, "Unlimited Plan");
    }
}
