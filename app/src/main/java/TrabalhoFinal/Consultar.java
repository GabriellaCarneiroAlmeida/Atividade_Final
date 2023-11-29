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
        System.out.print("As(os) estudante(s):");
        System.out.println(this.notas.getNomes());
        System.out.print("Tem, no trabalho final nota(s):");
        System.out.println(this.notas.getNotas());
    }

    @Override
    public String toString() {
        return "Consultar{" + "notas=" + notas + '}';
    }
    
}
