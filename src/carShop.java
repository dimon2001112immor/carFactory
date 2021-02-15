public class carShop {
    public car byeCar(CarMark carMark) {
        car myNewCar = null;
        switch (carMark) {
            case MAZ -> {
                myNewCar = new maz();
                break;
            }
            case TESLA -> {
                myNewCar = new tesla();
                break;
            }
            case VOLVO -> {
                myNewCar = new volvo();
                break;

            }
        }
        System.out.println("Ваша машина" + myNewCar.carName());
        return myNewCar;
    }


}
