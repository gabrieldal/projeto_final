import java.util.Scanner;

public class HalfAdder2 {
    private char A, B;
    private PortaAnd portaAnd;
    private PortaXor portaXor;



    public HalfAdder2(char A, char B) {
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