
public class Registrador {
    //implementar regitador usando vetor 
    private char[] reg;
    

    public Registrador() {
        reg = new char[8];
    }

    public void setReg(char[] reg) {
        this.reg = reg;
    }

    public char[] getReg() {
        return reg;
    }

    public void setValor(char valor) {
        reg[0] = valor;
    }

    public char getValor() {
        return reg[0];
    }

    
}
