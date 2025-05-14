import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static int funcaoHash(String palavra, int tam) {
        int hash = 13 + palavra.toUpperCase().charAt(0);  // pega a inicial e soma 13
        return hash % tam;
    }

    // Função de busca
    public static boolean buscarPalavra(String palavra, ArrayList<String>[] tabelaHash, int tam) {
        int categoria = funcaoHash(palavra, tam);
        
        System.out.println("Categoria esperada para '" + palavra + "': " + categoria);

        return tabelaHash[categoria].contains(palavra);
    }

    public static void main(String[] args) throws Exception {
        int totalCategorias = 26;
        ArrayList<String> tabelaHash[] = new ArrayList[totalCategorias];

        // Inicializar a tabela
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.println(i + "-> " + tabelaHash[i]);
            tabelaHash[i] = new ArrayList<String>();
        }

        System.out.println("---INSTANCIADAS---");
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.println(i + "-> " + tabelaHash[i]);
        }

        System.out.println("Adicionando palavras...");
        ArrayList<String> palavrasGeradas = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String palavra = GeradorPalavras.gerarPalavraAleatoria(3, 10);
            palavrasGeradas.add(palavra);
            int categoria = funcaoHash(palavra, totalCategorias);
            tabelaHash[categoria].add(palavra);
        }

        System.out.println("---PREENCHIDA---");
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.println(i + "-> total = " + tabelaHash[i]);
        }

        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("\nDigite uma palavra para buscar: ");
            String palavraBusca = scanner.nextLine().toLowerCase();

            if (buscarPalavra(palavraBusca, tabelaHash, totalCategorias)) {
                System.out.println("Palavra '" + palavraBusca + "' encontrada.");
            } else {
                System.out.println("Palavra '" + palavraBusca + "' não encontrada.");
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.nextLine().toUpperCase();

        } while (continuar.equals("S"));

        scanner.close();
    }


    public static class GeradorPalavras {

        public static String gerarPalavraAleatoria(int tamanhoMin, int tamanhoMax) {
            Random random = new Random();
            int tamanho = random.nextInt(tamanhoMax - tamanhoMin + 1) + tamanhoMin;
            StringBuilder palavra = new StringBuilder(tamanho);

            for (int i = 0; i < tamanho; i++) {
                // Gera um caractere aleatório entre 'a' (97) e 'z' (122)
                char letra = (char) (random.nextInt(26) + 97);
                palavra.append(letra);
            }

            return palavra.toString();
        }

        public static void main(String[] args) {
            // Testando a função com 10 palavras aleatórias
            for (int i = 0; i < 10; i++) {
                System.out.println(gerarPalavraAleatoria(3, 10));
            }
        }
    }
}
