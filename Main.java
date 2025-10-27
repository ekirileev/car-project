public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2015, "Black", 25000, "AB123CD"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000, "EF456GH"),
            new Car(3, "Toyota", "Corolla", 2010, "Red", 20000, "IJ789KL")
        };

        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        System.out.println("Найдено Toyota: " + toyotaCars.length);

        Car[] oldToyotas = getCarByBrendAndYearOperational(cars, "Toyota", 5);
        System.out.println("Toyota старше 5 лет: " + oldToyotas.length);
    }

    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                count++;
            }
        }

        Car[] result = new Car[count];
        int index = 0;
        
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                result[index] = car;
                index++;
            }
        }
        
        return result;
    }

    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {
        int currentYear = java.time.Year.now().getValue();
        
        int count = 0;
        for (Car car : cars) {
            int carAge = currentYear - car.getYear();
            if (car.getBrand().equalsIgnoreCase(brend) && carAge > years) {
                count++;
            }
        }

        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            int carAge = currentYear - car.getYear();
            if (car.getBrand().equalsIgnoreCase(brend) && carAge > years) {
                result[index] = car;
                index++;
            }
        }
        
        return result;
    }
}
