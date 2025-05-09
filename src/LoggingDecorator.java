public class LoggingDecorator extends TransportDecorator {
    public LoggingDecorator(Transport decoratedTransport) {
        super(decoratedTransport);
    }

    @Override
    public void move() {
        decoratedTransport.move();
        System.out.println("Логування маршруту транспорту.");
    }
}
