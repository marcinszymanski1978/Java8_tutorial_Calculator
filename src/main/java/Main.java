import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {


    @FunctionalInterface
    public interface CalculationInterface {

        double calculation_two_arg(double a, double b);
    }

    private static Map<String,CalculationInterface> mapa_operacji = new HashMap<String,CalculationInterface>();

    private static void fillMap() {
        mapa_operacji.put("+", (a, b) -> a + b);
        mapa_operacji.put("-", (a, b) -> a - b);
        mapa_operacji.put("/", (a, b) -> a / b);
        mapa_operacji.put("*", (a, b) -> a * b);
        mapa_operacji.put("^",(a,b)-> Math.pow(a,b));
    }

    private static void result(String operator, double a, double b) {
        double result = mapa_operacji.get(operator).calculation_two_arg(a, b);
        System.out.println(result);
    }

    public static void main(String[] args) {

        fillMap();
        System.out.println(mapa_operacji.keySet());
        result("+",2,6);



    }

}
