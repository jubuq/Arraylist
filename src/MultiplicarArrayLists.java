import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MultiplicarArrayLists {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Digite os números do primeiro ArrayList separados por espaço:");
 ArrayList<Integer> lista1 = parseArrayList(scanner.nextLine());
 System.out.println("Digite os números do segundo ArrayList separados por espaço:");
 ArrayList<Integer> lista2 = parseArrayList(scanner.nextLine());
 ArrayList<Integer> resultado = multiplicarArrayLists(lista1, lista2);
 System.out.println("Resultado da multiplicação:");
 System.out.println(resultado);
 scanner.close();
 }
 public static ArrayList<Integer> parseArrayList(String input) {
 String[] numerosString = input.split("\\s+");
 ArrayList<Integer> lista = new ArrayList<>();
 for (String numString : numerosString) {
 try {
 int numero = Integer.parseInt(numString);
 lista.add(numero);
 } catch (NumberFormatException e) {
 System.out.println("Entrada inválida: " + numString + ". Ignorando...");
 }
 }
 return lista;
 }
 public static ArrayList<Integer> multiplicarArrayLists(ArrayList<Integer> lista1,
ArrayList<Integer> lista2) {
 if (lista1.size() != lista2.size()) {
 }
 ArrayList<Integer> resultado = new ArrayList<>();
 for (int i = 0; i < lista1.size(); i++) {
 resultado.add(lista1.get(i) * lista2.get(i));
 }
 return resultado;
 }
}