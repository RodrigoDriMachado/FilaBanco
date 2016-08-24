package Exec_11_08;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class FilaCliente {

    private Queue filaPrioritaria;
    private Queue filaNormal;
    private static FilaCliente cadCliente;

    public FilaCliente() {
        filaPrioritaria = new PriorityQueue();
        filaNormal = new PriorityQueue();
    }

    public static FilaCliente getInstance() {
        if (cadCliente == null) {
            cadCliente = new FilaCliente();
        }
        return cadCliente;
    }

    public void cleanFilaPrioritaria() {
         filaPrioritaria.clear();
    }

    public void cleanFilaNormal() {
         filaNormal.clear();
    }

    public void addCliente(Cliente cliente) {
        if (cliente.getIdade() >= 65) {
            addPrioritario(cliente);
        } else {
            addNormal(cliente);
        }
    }

    private void addNormal(Cliente cliente) {
        filaNormal.add(cliente);
    }

    private void addPrioritario(Cliente cliente) {
         filaPrioritaria.add(cliente);
    }

    public void removeNormal() {
         filaNormal.remove();
    }

    public void removePrioritario() {
        filaPrioritaria.remove();
    }

    public int sizePrioritaria() {
        return filaPrioritaria.size();
    }
    
    public int sizeNormal(){
        return filaNormal.size();
    }
    
    public boolean normalVazia (){
        return filaNormal.isEmpty();
    }
    
    public boolean prioritariaVazia (){
        return filaPrioritaria.isEmpty();
    }

}
