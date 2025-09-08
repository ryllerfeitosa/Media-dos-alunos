import java.util.Scanner;

public class MediaAlunos {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double pesoNota1;
    private double pesoNota2;
    private double pesoNota3;
    private double mediaPonderada;


    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o nome do aluno?");
        nome = leitor.nextLine();

        System.out.println("Qual a nota 1 do aluno " + nome + "?");
        nota1 = leitor.nextDouble();

        System.out.println("Qual o peso da nota 1 do " + nome + " de 0 a 5?");
        pesoNota1 = leitor.nextDouble();

        System.out.println("Qual a nota 2 do aluno " + nome + "?");
        nota1 = leitor.nextDouble();

        System.out.println("Qual o peso da nota 2 do " + nome + " de 0 a 5?");
        pesoNota1 = leitor.nextDouble();

        System.out.println("Qual a nota 3 do aluno " + nome + "?");
        nota1 = leitor.nextDouble();

        System.out.println("Qual o peso da nota 3 do " + nome + " de 0 a 5?");
        pesoNota1 = leitor.nextDouble();

        exibirResultado();
        leitor.close();

    }
    public void CalcularMedia(){
        mediaPonderada = ((nota1 * pesoNota1) + (nota2 * pesoNota2) + (nota3 * pesoNota3)) / 5;
    }
    public void exibirResultado(){

    CalcularMedia();
        System.out.println("A média ponderada do aluno " + nome + " é " + mediaPonderada);

    }
}
