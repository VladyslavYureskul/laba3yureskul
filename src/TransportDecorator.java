public abstract class TransportDecorator implements Transport {
    protected Transport decoratedTransport;

    public TransportDecorator(Transport decoratedTransport) {
        this.decoratedTransport = decoratedTransport;
    }

    public void move() {
        decoratedTransport.move();
    }
}
