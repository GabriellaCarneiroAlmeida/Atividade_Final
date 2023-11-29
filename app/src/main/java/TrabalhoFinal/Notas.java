/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal;

import java.util.ArrayList;

/**
 *
 * @author Gabriella Cordeiro Almeida
 */
public class Notas {
    ArrayList<String> nomes = new ArrayList<String>();
    ArrayList<Double> notas = new ArrayList<Double>();

    public Notas() {
    }

    public void setNomes(String nomes) {
        this.nomes.add(nomes);
    }

    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public void setNotas(double notas) {
        this.notas.add(notas);
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
    

    @Override
    public String toString() {
        return "Notas{" + "nomes=" + nomes + ", notas=" + notas + '}';
    }
    
    
}
