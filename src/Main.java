public class Main {
    public static void main(String[] args) {
        Transport bus = new Bus();

        // Декоруємо автобус логуванням
        Transport loggedBus = new LoggingDecorator(bus);

        // Викликаємо поведінку
        loggedBus.move();
    }
}
