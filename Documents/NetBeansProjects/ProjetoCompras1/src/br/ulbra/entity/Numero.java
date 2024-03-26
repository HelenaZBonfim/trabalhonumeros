package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Numero {

    public ArrayList numero;

    public Numero() {
        numero = new ArrayList();
    }

    //create-add
    public void salvar(String item) {
        numero.add(item);
        JOptionPane.showMessageDialog(null, "Salvar com sucesso!");
    }

    //read - listar
    public String listar() {
        String res = "";
        if (!numero.isEmpty()) {
            for (int i = 0;
                    i < numero.size();
                    i++) {
                res+= (i+1)+ "- "+numero.get(i)+"\n";
            }
        } else {
            res = "Lista vazia!";
        }
        return res;
    }

    public void excluir(int indice) {
        if (!numero.isEmpty()) {
            if (indice > 0 && indice <= numero.size()) {
                numero.remove(indice - 1);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Numero inexistente!");

        }}else { 
                JOptionPane.showMessageDialog (null, "Impossivel excluir, lista está vazia!");
                }
    }
        public void alterar(int indice, String elemento) {
        if (!numero.isEmpty()) {
            if (indice > 0 && indice <= numero.size()) {
               numero.set(indice - 1, elemento);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Numero inexistente!");

        }}else { 
                JOptionPane.showMessageDialog (null, "Impossivel excluir, lista está vazia!");
                }
    }

    public void editar(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

