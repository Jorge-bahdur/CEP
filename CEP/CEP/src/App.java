import com.google.gson.Gson;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
         Gson gson = new Gson();
         Scanner scanner = new Scanner(System.in);
         Endereco[] enderecos = new Endereco[3];
         
         for (int i = 0; i < 3; i++) {
         System.out.print("Digite o CEP (" + (i + 1) + "/3): ");
         String cep = scanner.nextLine();
         enderecos[i] = consultaCep(cep);
         }
         
         System.out.println("\nEndereços Consultados:");
         for (Endereco endereco : enderecos) {
         if (endereco != null) {
         System.out.println(endereco);
         } else {
         System.out.println("Erro na consulta.");
         }
         }
         
         scanner.close();
         }
         }