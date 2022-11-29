import java.time.LocalDate;

public interface Service {
    LocalDate getAge(Customer[] customers);
    Customer[] sameCountry(Customer[] customers, String country);
    Country[] sortCountry(Customer[] customers);
    Customer[] customers(Customer[] customers);
}
