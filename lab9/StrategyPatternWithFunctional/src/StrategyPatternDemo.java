import java.util.Arrays;
import java.util.List;

public class StrategyPatternDemo {
  public static void main(String[] args) {

    List<Strategy> operations = 
          Arrays.asList(
              (n, m)-> { return n+m; },
              (n, m)-> { return n*m; },
              (n, m)-> { return n-m; }
          );
    operations.forEach((comp) -> System.out.println(comp.doOperation(5, 2)));
  }
}


