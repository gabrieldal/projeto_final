import java.util.Scanner;

public class Memoria {
    private Registrador[] memDados = new Registrador[128];
    private Registrador[] memInstrucoes = new Registrador[128];

    public Memoria() {
        for (int i = 0; i < 128; i++) {
            memDados[i] = new Registrador();
            memInstrucoes[i] = new Registrador();
        }
    }

    public void setMemDados(int posicao, char[] valor) {
        memDados[posicao].setReg(valor);
    }

    public char[] getMemDados(int posicao) {
        return memDados[posicao].getReg();
    }

    public void setMemInstrucoes(int posicao, char[] valor) {
        memInstrucoes[posicao].setReg(valor);
    }

    public char[] getMemInstrucoes(int posicao) {
        return memInstrucoes[posicao].getReg();
    }

}
