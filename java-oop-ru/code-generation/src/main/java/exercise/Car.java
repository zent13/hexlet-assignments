package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN

    @Override
    public String toString() {
        String result =
                "{\n"
                + "\t\"id\":" + this.getId() + ",\n"
                + "\t\"brand\":" + "\"" + this.getBrand() + "\"" + ",\n"
                + "\t\"model\":" + "\"" + this.getModel() + "\"" + ",\n"
                + "\t\"color\":" + "\"" + this.getColor() + "\"" + ",\n"
                + "\t\"owner\":" + "{\n"
                + "\t\t\"id\":" + this.owner.getId() + ",\n"
                + "\t\t\"firstName\":" + "\"" + this.owner.getFirstName() + "\"" + ",\n"
                + "\t\t\"lastName\":" + "\"" + this.owner.getLastName() + "\"" + ",\n"
                + "\t\t\"age\":" + this.owner.getAge() + ",\n"
                + "\t\t}\n"
                + "}";

        return result;
    }

    public String serialize() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String result = objectMapper.writeValueAsString(this);
        System.out.println(result);

        return result;
    }

    public static Car unserialize(String stringCar) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = objectMapper.readValue(stringCar, Car.class);
        System.out.println(car.toString());

        return car;
    }
    // END
}
