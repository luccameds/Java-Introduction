import java.util.Scanner;

public class VetoresInvertidos {

  public static void main(String[] args) {
    int n, i, j = 0;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Insira o número de vetores:");
      n = sc.nextInt();

      int array[] = new int[n];
      int rev[] = new int[n];

      System.out.println("Insira " + n + " os valores: ");
      for (i = 0; i < n; i++) {
        array[i] = sc.nextInt();
      }
      System.out.println("A ordem dos vetores invertidos é:");

      for (i = n; i > 0; i--, j++) {
        rev[j] = array[i - 1];
        System.out.println(rev[j]);
      }
    }
  }
}
