/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tudoweb;

import java.util.Scanner;

public class TudoWeb {

    public static void main(String[] args) {
        String nome;
        int idade;
        int opiniao, excelente=0, bom=0, ruim=0;
        
        Scanner leitor = new Scanner(System.in);
        for(int i=0; i<50; i++) {
            System.out.print("Digite seu nome: ");
            nome = leitor.next();
            System.out.print("Digite sua idade: ");
            idade = leitor.nextInt();
            System.out.print("Qual sua opinião sobre o atendimento? Digite (1-Excelente, 2-Bom e 3-Ruim): "); //aqui deve ser digitado o número de acordo com a opinião desejada
            opiniao = leitor.nextInt(); // leitura do número correspondente a opção 1, 2 ou 3 do atendimento.
            if (opiniao == 1) { // se usuário digitar 1 será referente ao atendimento excelente
                excelente++;
            } else if (opiniao == 2) { // se usuário digitar 2 será referente ao atendimento bom
                bom++;
            } else if (opiniao == 3) { //se usuário digitar 3 será referente ao atendimento ruim
                ruim++;
            } else { // caso usuário digite um número inexistente a pesquisa de opinião, aparecerá a mensagem abaixo
                System.out.println("Opção inválida!");
            }
        }
        // contagem da opiniões
        System.out.println("A quantidade de atendimento Excelente foi: " + excelente);
        System.out.println("A quantidade de atendimento Bom foi: " + bom );
        System.out.println("A quantidade de atendimento Ruim foi: " + ruim );        
    }
    
}
