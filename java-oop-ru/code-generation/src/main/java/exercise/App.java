package exercise;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws IOException {
        Files.writeString(path, car.serialize());
    }

    public static Car extract(Path path) throws IOException {
        String stringFromFile = Files.readString(path);
        Car car = Car.unserialize(stringFromFile);

        return car;
    }
}
// END
