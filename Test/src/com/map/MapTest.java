import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class MapTest {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

//get list of unique squares
List<Integer> squaresList;

   List<Integer> c = numbers.stream().sorted().collect(Collectors.toList());
   
   
  

System.out.println("a :"+numbers);
  }
}
