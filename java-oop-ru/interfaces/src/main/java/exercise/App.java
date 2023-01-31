package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int lim) {
        return homes.stream()
                .sorted((h1, h2) -> h1.compareTo(h2))
                .map(home -> home.toString())
                .limit(lim)
                .collect(Collectors.toList());
    }
}
// END
