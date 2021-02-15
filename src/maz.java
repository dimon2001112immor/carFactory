public class maz implements car{
    @Override
    public int numOfWeels() {
        return 8;
    }

    @Override
    public String engineType() {
        return "diesel";
    }

    @Override
    public int maxSpeed() {
        return 150;
    }

    @Override
    public boolean backseats() {
        return false;
    }

    @Override
    public String carName() {
        return "maz";
    }
}
