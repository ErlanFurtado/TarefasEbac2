package mod15;

public class ContratosFactory extends Factory {
    Car retriveCar(String requesteGrade){
        if("A".equals(requesteGrade)){
            return new Toyota(100, "cheio", "azul");

        }else {
            return null;
        }
    }

    @Override
    Car retrieveCar(String requestedGrade) {
        return null;
    }
}
