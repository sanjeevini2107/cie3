public class BankCustomer {
    private String name;
    private String accountNumber;
    private int age;

    public BankCustomer(String name, String accountNumber, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Age: " + age);
    }

    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Nisarga", "1234567890", 21);
        customer.displayCustomerInfo();
    }
}