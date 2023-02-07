import portas.PortaAnd;
import portas.PortaXor;

public class HalfAdder {
    private char A, B;
    private PortaAnd portaAnd;
    private PortaXor portaXor;

    public HalfAdder(char A, char B) {
        this.A = A;
        this.B = B;
    }

    public char SumOUT2() {
        portaXor = new PortaXor(A, B);
        return portaXor.GetSaida();
    }

    public char CarryOUT2() {
        portaAnd = new PortaAnd(A, B);
        return portaAnd.GetSaida();
    }
}