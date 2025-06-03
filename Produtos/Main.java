import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe descrição, armazem e ano:");
        String descricaoCarro= scanner.nextLine();
        String armazemCarro = scanner.nextLine();
        int anoCarro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe marca,modelo e potência");
        String marca = scanner.nextLine();
        String modelo = scanner.nextLine();
        double potencia = scanner.nextDouble();
        scanner.nextLine();//Para evitar erro
        Carro carro = new Carro(descricaoCarro,armazemCarro,anoCarro,marca,modelo,potencia);
        //Chamando o método sobescrito
        carro.exibirInfo();
        System.out.println("Informe descrição, armazem e ano:");
        String descricaoLivro = scanner.nextLine();
        String armazemLivro= scanner.nextLine();
        int anoLivro = scanner.nextInt();
        scanner.nextLine();//Para evitar erro
        System.out.println("Informe nome do livro,autor e editora");
        String nome = scanner.nextLine();
        String autor = scanner.nextLine();
        String editora = scanner.nextLine();
        //Criando um objeto da classe filho livro
        Livro livro = new Livro(descricaoLivro,armazemLivro,anoLivro,nome,autor,editora);
        //Chamando o método sobescrito
        livro.exibirInfo();
    }
}
//No main fazemos uso das classes criadas anteriormente e é feita a interação com o usuário