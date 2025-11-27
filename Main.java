import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Variaveis v = new Variaveis();

        Scanner input = new Scanner(System.in);
        System.out.println("Qual produto deseja colocar no seu carro: \n1.Álcool\n2.Gasolina\n3.Diesel\n" +
                "4.Fim");
        System.out.println("Digite um valor de entrada: ");
        int opcao = input.hasNextInt() ? input.nextInt() : 4;

     while(opcao != 4 &&  opcao <= 4) {

         System.out.print("Digite uma opcao das opções do produto: ");
         opcao = input.nextInt();


         if(opcao == 1 ) {
             v.contagemAlcool(opcao);
             System.out.println("O cliente adquiriu alcool, cadastro feito  com sucesso!");
         }else if(opcao == 2 ) {
             v.contagemGasolina(opcao);
             System.out.println("O cliente adquiriu Gasolina, cadastro feito  com sucesso!");
         }else if(opcao == 3) {
             v.contagemDisel(opcao);
             System.out.println("O cliente adquiriu Disel, cadastro feito  com sucesso!");

         }else  if(opcao >5) {
             System.out.println("Erro ao cadastrar !!!");
             System.out.print("Digite uma opcao dentro das apresentada acima: ");
             opcao = input.nextInt();
         }

     }
        System.out.println("\nMuito Obrigado !!!");
        System.out.println( "Os produtos que o cliente adiquiriu: "+ "\nAlcool:"+ v.getAlcool()+"\nGasolina:"+ v.getGasolina()+ "\nDisel: "+ v.getDisel()  );
        System.out.println("Muito obrigado por comprar na nossa loja, volte sempre!!");
    }

}