package Exec_11_08;

public class Atendimento {

    private static FilaCliente filaCliente ;
    private boolean vazio;
    
    public Atendimento(){
        filaCliente = new FilaCliente();
    }

    public void efetuaAtendimento(int numCaixa) {
        if (numCaixa <= 5) {
             atendePrioritario();
        } else {
             atendeNormal();
        }

    }

    private void atendeNormal() {
         filaCliente.removeNormal();
     
    }

    private void atendePrioritario() {
         filaCliente.removePrioritario();
    }

    public int quantidadePrioritario() {
        return filaCliente.sizePrioritaria();
    }

    public int quantidadeNormal() {
        return filaCliente.sizeNormal();
    }
}
