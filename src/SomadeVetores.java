import java.util.Scanner;
import java.util.stream.IntStream;

public class SomadeVetores {

  public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Digite quantos vetores:");

      int length = sc.nextInt();
      int[] myArray = new int[length];

      System.out.println("Digite os valores:");

      for (int i = 0; i < length; i++) {
        myArray[i] = sc.nextInt();
      }

      int sum = IntStream.of(myArray).sum();
      System.out.println("Soma dos Vetores = " + sum);
    }
  }
}
