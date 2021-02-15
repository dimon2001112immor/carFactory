public class volvo implements car{
    @Override
    public int numOfWeels() {
        return 4;
    }

    @Override
    public String engineType() {
        return "fuel";
    }

    @Override
    public int maxSpeed() {
        return 220;
    }

    @Override
    public boolean backseats() {
        return true;
    }

    @Override
    public String carName() {
        return null;
    }
}
