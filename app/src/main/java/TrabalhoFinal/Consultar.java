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
    Notas notas = new Notas();

    public Consultar(Notas notas) {
        this.notas = notas;
    }
    
    public void printNotas(){
        System.out.print("A(o) estudante:");
        System.out.println(this.notas.nomes);
        System.out.print("Tem, no trabalho final nota:");
        System.out.println(this.notas.notas);
    }
}
