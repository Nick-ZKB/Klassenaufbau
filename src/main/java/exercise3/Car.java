package exercise3;

public class Car {
    public double fuelLevel;
    public double mileage;
    public String licensePlate;
    public double fuelConsumption; // in Liter pro 100 km
    public double fuelCapacity;

    public Car(double fuelLevel, double mileage, String licensePlate, double fuelConsumption, double fuelCapacity) {
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
        this.licensePlate = licensePlate;
        this.fuelConsumption = fuelConsumption;
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        if (fuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity;
        }
    }


    public void drive(double distance) {
        double neededFuel = fuelConsumption * distance;

        if (neededFuel > fuelLevel) {
            double possibleDistance = fuelLevel / fuelConsumption;
            mileage += possibleDistance;
            fuelLevel = 0;
        } else {
            mileage += distance;
            fuelLevel -= neededFuel;
        }

        mileage = Math.round(mileage * 100.0) / 100.0;
        fuelLevel = Math.round(fuelLevel * 100.0) / 100.0;

    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", mileage=" + mileage +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}