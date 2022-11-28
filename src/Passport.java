import java.util.Objects;
import java.util.Set;

public class Passport {

    private Set<String> numberPassport;
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;

    public Passport(Set<String> numberPassport, String lastName,
                    String firstName, String middleName, String birthDate) {
        this.numberPassport = numberPassport;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        if (lastName == null || lastName.isBlank() || lastName.isEmpty()) {
            throw new RuntimeException("Введите ФАМИЛИЮ!");
        }
        if (firstName == null || firstName.isBlank() || firstName.isEmpty()) {
            throw new RuntimeException("Введите ИМЯ!");
        }
        if (birthDate == null || birthDate.isBlank() || birthDate.isEmpty()) {
            throw new RuntimeException("Ввведите ДАТУ РОЖДЕНИЯ!");
        }
    }

    public Set<String> getNumberPassport() {
        return numberPassport;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public boolean checkNumber(String check) {
        return numberPassport.contains(check);
    }

    public static Object searchPassport(Set<Passport> passportNumber, String number) {
        for (Passport passportNumbers : passportNumber) {
            if (passportNumbers.checkNumber(number)) {
                return passportNumbers;
            }
        }
        return "Такого паспорта не существует!";
    }

    @Override
    public String toString() {
        return "Паспорт гражданина РФ." +
                " Серия и номер паспорта: " + numberPassport +
                ". Фамилия: " + lastName +
                ". Имя: " + firstName +
                ". Отчество: " + middleName +
                ". Дата рождения: " + birthDate + " года рождения.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(numberPassport, passport.numberPassport) && Objects.equals(lastName, passport.lastName) && Objects.equals(firstName, passport.firstName) && Objects.equals(middleName, passport.middleName) && Objects.equals(birthDate, passport.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPassport, lastName, firstName, middleName, birthDate);
    }
}
