public class MemDados {
    private int[] memoria = new int[128];
    
    public MemDados() {
        for (int i = 0; i < memoria.length; i++) {
            memoria[i] = 0;
        }
    }
    
    public void setDado(int posicao, int valor) {
        memoria[posicao] = valor;
    }
    
    public int getDado(int posicao) {
        return memoria[posicao];
    }

    public String getDatas() {
        String instructions = new String("");

        for (int i = 0; i < 128; i++) {
            // System.out.println(memoria[i]);

            instructions += "   Posicao [" + (i+128) + "]->    " + memoria[i] + "\n";
        }
        return instructions;
    }
}
