import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class Main {
  public static void main(String[] args) {
    File directory = new File("./src/main/java");
    String[] names = directory.list((dir, name) -> name.endsWith("java"));
    System.out.println("Result : ");
    System.out.println(Arrays.asList(names));
  }
}



