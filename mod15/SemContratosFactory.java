package mod15;

public class SemContratosFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)){
            return new Gol(100, "cheio", "branco");

        } else {
            return null;
        }
    }
}
