import org.flywaydb.core.Flyway;

public final class Main {
    public static void main(String[] args) {
        final Flyway flyway = Flyway.configure().dataSource("jdbc:postgresql://localhost:5432/CoursesMail", "postgres", "123")
                .locations("db")
                .load();
        flyway.clean();
        flyway.migrate();
    }
}
