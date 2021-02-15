public class tesla implements car{
    @Override
    public int numOfWeels() {
        return 4;
    }

    @Override
    public String engineType() {
        return "electric";
    }

    @Override
    public int maxSpeed() {
        return 180;
    }

    @Override
    public boolean backseats() {
        return false;
    }

    @Override
    public String carName() {
        return null;
    }
}
