import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Passport> passportSet = new HashSet<>();

        Passport viktor = new Passport(Collections.singleton("123_123"), "Пупкин",
                "Виктор", "Степанович", "12.01.1999");
        Passport vasiliy = new Passport(Collections.singleton("133_133"), "Булкин",
                "Василий", "Алибобаевич", "13.10.1992");
        Passport mariya = new Passport(Collections.singleton("999_999"), "Ласточкина",
                "Мария", "Петровна", "12.01.1999");

        passportSet.add(viktor);
        passportSet.add(vasiliy);
        passportSet.add(mariya);

        for (Passport passport : passportSet) {
            System.out.println(passport);
        }

        System.out.println("Поиск гражданина... ");
        System.out.println("Документ: " + Passport.searchPassport(passportSet, "999_999"));
    }
}