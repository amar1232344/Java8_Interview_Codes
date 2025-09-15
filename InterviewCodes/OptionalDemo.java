import java.util.Optional;

class Employees {
    private String name;
    private String email;

    Employees(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + "(" + email + ")";
    }
}

public class OptionalDemo {
    public static void main(String[] args) {
        Employees emp1 = new Employees("Rahul", "rahul@gmail.com");
        Employees emp2 = new Employees("Priya", null);

        // Use Optional to avoid NullPointerException
        printEmail(emp1);
        printEmail(emp2);
    }

    private static void printEmail(Employees emp) {
        Optional.ofNullable(emp.getEmail())
                .ifPresentOrElse(
                        email -> System.out.println("Email " + email),
                        () -> System.out.println("Email not provides")
                );
    }
}
