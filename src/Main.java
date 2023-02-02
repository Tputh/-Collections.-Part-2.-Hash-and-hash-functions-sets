import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Коллекции. Часть 2. Хеш и хеш-функции, множества");
        Driver driver = new Driver("Иван");
        Driver driver1 = new Driver("Иван");

        Set<Driver> driverSet = new HashSet<>();
        driverSet.add(driver);
        driverSet.add(driver1);
        System.out.println(driverSet);
    }
}