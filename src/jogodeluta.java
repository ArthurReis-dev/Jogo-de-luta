import java.util.Scanner;

public class jogodeluta{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String vetor[][] = new String[2][6];
        String[] vetorR = new String[11];
        String personagem;
        boolean encontrou = false;
        int aux = 0;

        //Recebe os nomes dos personagens
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 6; j++){
                System.out.print("Digite o nome do personagem " + i + j + ": " );
                vetor[i][j] = scanner.nextLine();
            }
        }

        //Validação do personagem escolhido
        do {
            System.out.print("Digite o nome do lutador escolhido: ");
            personagem = scanner.nextLine();

            encontrou = false;
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 6; j++){
                    if(!personagem.equals(vetor[i][j])){
                        encontrou = true;
                    }
                }
            }

            if(!encontrou){
                System.out.println("Personagem não encontrado! Tente novamente.");
            }
        } while(!encontrou);

        //Preenche o vetor de adversários
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 6; j++){
                if(!personagem.equals(vetor[i][j])){
                    vetorR[aux] = vetor[i][j];
                    aux++;
                }
            }
        }

        //Mostrar o roteiro das lutas
        System.out.println("\nO roteiro de lutas é: ");
        for(int k = 0; k < 11; k++){
            System.out.println((k+1) + "ª luta: " + personagem + " vs " + vetorR[k]);
        }
        scanner.close();
    } 
}