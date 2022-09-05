package interfaces;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = { new EmailLogger(), new FileLogger(), new DatabaseLogger(), new SmsLogger() };
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer engin = new Customer(1, "Engin", "Demiroğ");
        customerManager.add(engin);

    }
}
