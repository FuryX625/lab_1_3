import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Wczytywanie = new Scanner(System.in);
    int a, b, suma;
    System.out.println("Podaj liczbę a: ");
    a=Wczytywanie.nextInt();
    System.out.println("Podaj liczbę b: ");
    b=Wczytywanie.nextInt();
    suma=a+b;
    double potega=Math.pow(a,b);
    System.out.println("Suma liczb a oraz b to: "+suma);
    System.out.println("Liczba a do potęgi b to: "+potega);
  }
}