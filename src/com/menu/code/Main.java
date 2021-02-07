
package com.menu.code;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {


     boolean exit = false;

     AdmAcess adm = new AdmAcess();

     while(!exit){



             int userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "bem vindos ao salgado da simone! :) \n" +
                     "|====================|\n" +
                     "escolha uma opção:\n" +
                     "1. Escolher salgados\n" +
                     "2. Escolher bebidas\n" +
                     "3. Finalizar pedido\n" +
                     "4. Pedir conta\n" +
                     "|====================|\n" +
                     "5. Se for Adm\n" +
                     "6. Sair"));

         if (userChoice == 1) {
             String userC = JOptionPane.showInputDialog(null, "que tipo de" +
                     "salgado voce vai querer?");
         }
         else if (userChoice == 2) {

         }
         else if (userChoice == 3) {

         }
         else if (userChoice == 4) {

         }
         else if (userChoice == 5) {
             int admPassword = Integer.parseInt(JOptionPane.showInputDialog(null, "por favor" +
                     "digite a senha de acesso:"));

             if(adm.openAcess(admPassword) == true){
                int admUser = Integer.parseInt(JOptionPane.showInputDialog("bem vindo adminstrador! o que voce gostaria de fazer?\n" +
                        "1. Abastecer Salgados\n" +
                        "2. Abastecer Bebidas\n" +
                        "3. Ver lucro total do dia\n" +
                        "4. Sair"));
             }
             else{
                 JOptionPane.showMessageDialog(null,"Acesso negado!");
                 continue;
             }

         }
         else if(userChoice == 6){

             JOptionPane.showMessageDialog(null,"tenha um bom lanche! :)");
             exit = true;
             break;
         }
         else{
             JOptionPane.showMessageDialog(null,"por favor digite uma" +
                     " entrada válida!");
             continue;
         }



     }

    }
}
