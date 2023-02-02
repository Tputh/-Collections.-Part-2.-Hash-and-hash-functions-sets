import java.util.Objects;

public class Driver {
    private String fio;


    public Driver(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(fio, driver.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio);
    }

    @Override
    public String toString() {
        return " Водитель "  + fio;
    }
}
