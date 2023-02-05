import java.lang.reflect.Array;
import java.util.Arrays;

public class Memoria {
    private Registrador[] mem = new Registrador[256];


    public Memoria(){
        Registrador reg = new Registrador();
        char [] UmByte = {'0','0','0','0','0','0','0','0'};
        reg.executar(UmByte);
        Arrays.fill(mem, reg);
    }


    Public char executar()



}
