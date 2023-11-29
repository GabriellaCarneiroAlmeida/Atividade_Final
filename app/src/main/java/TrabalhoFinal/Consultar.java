/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal;

/**
 *
 * @author Gabriella Carneiro Almeida #2
 */
public class Consultar {

    public Consultar() {
    }
    
    public void printNotas(){
        Notas notas = new Notas();
        System.out.print("A(o) estudante:");
        System.out.println(notas.nomes);
        System.out.print("Tem, no trabalho final nota:");
        System.out.println(notas.notas);
    }
}
